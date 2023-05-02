// ecListFuncs.h
// CSCI 455 Spring 2023, Extra Credit assignment
// You do not need to modify or submit this file.

#ifndef EC_LIST_FUNCS_H
#define EC_LIST_FUNCS_H

#include <iostream>
#include <string>


//*************************************************************************
// Node type used for lists
struct Node {
   int data;
   Node *next;

   Node(int item);
   Node(int item, Node *n);

};


typedef Node * ListType;

int numRuns(ListType list);

#endif
