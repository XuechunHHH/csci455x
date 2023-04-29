// Name: Xuechun Hua
// USC NetID: xuechunh
// CS 455 PA5
// Spring 20223

// pa5list.cpp
// a program to test the linked list code necessary for a hash table chain

// You are not required to submit this program for pa5.

// We gave you this starter file for it so you don't have to figure
// out the #include stuff.  The code that's being tested will be in
// listFuncs.cpp, which uses the header file listFuncs.h

// The pa5 Makefile includes a rule that compiles these two modules
// into one executable.

#include <iostream>
#include <string>
#include <cassert>

using namespace std;

#include "listFuncs.h"


int main() {
   ListType head = NULL;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << "insert a 0, success" << endl;
   cout << addNode(head, "a", 0) << endl;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << "insert b 1, success" << endl;
   cout << addNode(head, "b", 1) << endl;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << "insert a 1, fail" << endl;
   cout << addNode(head, "a", 1) << endl;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << "insert c 2, success" << endl;
   cout << addNode(head, "c", 2) << endl;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << "remove a, success" << endl; 
   cout << removeNode(head, "a") << endl;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << "insert a 0, success" << endl;
   cout << addNode(head, "a", 0) << endl;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << "remove c, success" << endl;
   cout << removeNode(head, "c") << endl;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << "remove a, success" << endl;
   cout << removeNode(head, "a") << endl;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << "remove a, fail" << endl;
   cout << removeNode(head, "a") << endl;
   printNodeList(head, cout);
   cout << "----------------------------------------------" << endl;
   cout << listSize(head) << endl;
   return 0;
}