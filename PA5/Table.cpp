// Name: Xuechun Hua
// USC NetID: xuechunh
// CSCI 455 PA5
// Spring 2023

// Table.cpp  Table class implementation

#include "Table.h"

#include <iostream>
#include <string>
#include <cassert>

// for hash function called in private hashCode method defined below
#include <functional>

using namespace std;

// listFuncs.h has the definition of Node and its methods.  -- when
// you complete it it will also have the function prototypes for your
// list functions.  With this #include, you can use Node type (and
// Node*, and ListType), and call those list functions from inside
// your Table methods, below.

#include "listFuncs.h"

//*************************************************************************

Table::Table()
{
   hashSize = HASH_SIZE;
   table = new ListType[hashSize]();
   entrySize = 0;
   nonEmptyBucket = 0;
}

Table::Table(unsigned int hSize)
{
   hashSize = hSize;
   table = new ListType[hashSize]();
   entrySize = 0;
   nonEmptyBucket = 0;
}

int* Table::lookup(const string &key)
{
   Node *node = findNode(table[hashCode(key)], key);
   return node == NULL ? NULL : &node->value;
}

bool Table::remove(const string &key)
{
   bool isRemoved = removeNode(table[hashCode(key)], key);
   if (isRemoved)
   {
      entrySize--;
      nonEmptyBucket = listSize(table[hashCode(key)]) == 0 ? nonEmptyBucket - 1 : nonEmptyBucket;
   }
   return isRemoved;
}

bool Table::insert(const string &key, int value)
{
   bool isInsert = addNode(table[hashCode(key)], key, value);
   if (isInsert)
   {
      entrySize++;
      nonEmptyBucket = listSize(table[hashCode(key)]) == 1 ? nonEmptyBucket + 1 : nonEmptyBucket;
   }
   return isInsert;
}

int Table::numEntries() const
{
   return entrySize;
}

void Table::printAll() const
{
   for (unsigned int i = 0; i < hashSize; ++i)
   {
      printNodeList(table[i], cout);
   }
}

void Table::hashStats(ostream &out) const
{
   out << "number of buckets: " << hashSize << endl;
   out << "number of entries: " << entrySize << endl;
   out << "number of non-empty buckets: " << nonEmptyBucket << endl;
   out << "longest chain: " << findLongestChainIndex() << endl;
}

// hash function for a string
// (we defined it for you)
// returns a value in the range [0, hashSize)
unsigned int Table::hashCode(const string &word) const
{

   // Note: calls a std library hash function for string (it uses the good hash
   //   algorithm for strings that we discussed in lecture).
   return hash<string>()(word) % hashSize;
}

// add definitions for your private methods here

unsigned int Table::findLongestChainIndex() const
{
   unsigned int longest = 0;
   for (unsigned int i = 0; i < hashSize; ++i)
   {
      unsigned int length = listSize(table[i]);
      longest = length > longest ? length : longest;
   }
   return longest;
}