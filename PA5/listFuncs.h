// Name: Xuechun Hua
// USC NetID: xuechunh
// CSCI 455 PA5
// Spring 2023


//*************************************************************************
// Node class definition 
// and declarations for functions on ListType

// Note: we don't need Node in Table.h
// because it's used by the Table class; not by any Table client code.

// Note2: it's good practice to *not* put "using" statement in *header* files.  Thus
// here, things from std libary appear as, for example, std::string

#ifndef LIST_FUNCS_H
#define LIST_FUNCS_H

#include <string>
  

struct Node {
   std::string key;
   int value;

   Node *next;

   Node(const std::string &theKey, int theValue);

   Node(const std::string &theKey, int theValue, Node *n);
};


typedef Node * ListType;

//*************************************************************************
//add function headers (aka, function prototypes) for your functions
//that operate on a list here (i.e., each includes a parameter of type
//ListType or ListType&).  No function definitions go in this file.

/**
 *  Find the Node in the linked list by key and return the node
 *  else return null
*/
Node* findNode(ListType nodeList, const std::string &theKey);  

/**
 * Get the length of the linked list
*/
unsigned int listSize(ListType nodeList);

/** 
 * When the node doesn't exist in the linked list, add the node to last and return true
 * else return false
*/ 
bool addNode(ListType &nodeList, const std::string &theKey, int theValue);

/**
 * Remove the node by key and return true when it is in the linked list 
 * else return false
*/
bool removeNode(ListType &nodeList, const std::string &theKey);

/**
 * Print out the linked list
*/
void printNodeList(ListType nodeList, std::ostream &out);

// keep the following line at the end of the file
#endif
