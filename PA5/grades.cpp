// Name: Xuechun Hua
// USC NetID: xuechunh
// CSCI 455 PA5
// Spring 2023

/*
 * grades.cpp
 * A program to test the Table class.
 * How to run it:
 *      grades [hashSize]
 *
 * the optional argument hashSize is the size of hash table to use.
 * if it's not given, the program uses default size (Table::HASH_SIZE)
 *
 */

#include "Table.h"

// cstdlib needed for call to atoi
#include <cstdlib>

using namespace std;

/**
 * print command summary
 */ 
void help()
{
   cout << "Valid command : " << endl
        << "insert name score: Insert this name and score in the grade table. If this name was already present, print a message to that effect, and don't do the insert." << endl
        << "change name newscore: Change the score for name. Print an appropriate message if this name isn't present." << endl
        << "lookup name: Lookup the name, and print out his or her score, or a message indicating that student is not in the table." << endl
        << "remove name: Remove this student. If this student wasn't in the grade table, print a message to that effect." << endl
        << "print: Prints out all names and scores in the table." << endl
        << "size: Prints out the number of entries in the table." << endl
        << "stats: Prints out statistics about the hash table at this point. (Calls hashStats() method)" << endl
        << "help: Prints out a brief command summary." << endl
        << "quit: Exits the program." << endl;
}

/**
 * Insert name and score from console. 
 * If this name was already present, print an error message and no insert.
*/
void insert(Table *grades)
{
   string name;
   unsigned int score;
   cin >> name >> score;
   if (!grades->insert(name, score))
   {
      cout << "Error: " << name << " is already in the table. Insert fails." << endl;
   }
}

/**
 * Change the score for name from console. 
 * Print an error message if this name isn't present.
*/
void change(Table *grades)
{
   string name;
   unsigned int newScore;
   cin >> name >> newScore;
   int *preScore = grades->lookup(name);
   if (preScore == NULL)
   {
      cout << "Error: " << name << " is not in the table. Change fails." << endl;
   }
   else
   {
      *preScore = newScore;
   }
}

/**
 * Lookup the name from console, and print out the score. 
 * If student is not in the table, print an error message.
 */ 
void lookup(Table *grades)
{
   string name;
   cin >> name;
   int *score = grades->lookup(name);
   if (score == NULL)
   {
      cout << "Error: " << name << " is not in the table. Lookup fails." << endl;
   }
   else
   {
      cout << "The score of " << name << " is " << *score << endl;
   }
}

/**
 * Remove this student. 
 * If this student wasn't in the grade table, print an error message.
*/
void remove(Table *grades)
{
   string name;
   cin >> name;
   if (!grades->remove(name))
   {
      cout << "Error: " << name << " is not in the table. Remove fails." << endl;
   }
}

int main(int argc, char *argv[])
{

   Table *grades; // Table is dynamically allocated below, so we can call
                  // different constructors depending on input from the user.

   // optionally gets the hash table size from the command line
   if (argc > 1)
   {
      int hashSize = atoi(argv[1]); // atoi converts c-string to int

      if (hashSize < 1)
      {
         cout << "Command line argument (hashSize) must be a positive number"
              << endl;
         return 1;
      }

      grades = new Table(hashSize);
   }
   else
   { // no command line args given -- use default table size
      grades = new Table();
   }

   grades->hashStats(cout);

   // add more code here
   // Reminder: use -> when calling Table methods, since grades is type Table*

   bool isContinue = true;
   string command;

   while (isContinue)
   {
      cout << "cmd> ";
      cin >> command;
      if (command == "quit")
      {
         isContinue = false;
      }
      else if (command == "help")
      {
         help();
      }
      else if (command == "insert")
      {
         insert(grades);
      }
      else if (command == "lookup")
      {
         lookup(grades);
      }
      else if (command == "change")
      {
         change(grades);
      }
      else if (command == "remove")
      {
         remove(grades);
      }
      else if (command == "print")
      {
         grades->printAll();
      }
      else if (command == "size")
      {
         cout << grades->numEntries() << endl;
      }
      else if (command == "stats")
      {
         grades->hashStats(cout);
      }
      else
      {
         cout << "ERROR: invalid command" << endl;
      }
   }

   return 0;
}
