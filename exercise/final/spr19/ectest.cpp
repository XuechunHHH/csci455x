/*  Name: Xuechun Hua
 *  USC NetID: xuechunh
 *  CS 455 Spring 2023
 *  Extra credit assignment
 *
 *  ectest.cpp
 *
 *  a non-interactive test program to test the functions described in ecListFuncs.h
 *
 *    to run it use the command:   ectest
 *
 *  Note: this uses separate compilation.  You put your list code ecListFuncs.cpp
 *  Code in this file should call those functions.
 */


#include <iostream>
#include <string>

// for istringstream used in buildList (defined below)
#include <sstream>

#include "ecListFuncs.h"

using namespace std;


// You may use the following two utility functions that will make it easier to test
// your list functions on hard-coded list data and compare it to expected output:
// (function definitions for them appear at the bottom of this file)


/*
 * listToString
 *
 * PRE: list is a well-formed list.
 *
 * converts the list to a string form that has the following format shown by example.
 * the list is unchanged by the function.
 *
 *   string format:
 *
 *   "()"        an empty list
 *   "(3)        a list with one element, 3
 *   "(3 4 5)"   a list with multiple elements: 3 followed by 4 followed by 5
 *
 */
string listToString(ListType list);


/*
 * buildList
 * 
 * PRE: listString only contains numbers (valid integer format) and spaces
 *
 * creates and returns a linked list from a string of space separated numbers
 * 
 *
 * Examples:
 *  listString         return value of buildList(listString)
 *
 *    ""               ()
 *    "-32"            (-32)
 *    "     -32   "    (-32)
 *    "1 3 2"          (1 3 2)
 *    "  1 3 2"        (1 3 2)
 *
 */
ListType buildList(const string & listString);

void testInsertAtUnit(string str, int val, int loc, string exp){
   ListType list = buildList(str);
   cout << "Origin list: " << listToString(list) << endl;
   insertAt(list,val,loc);
   cout << "Expected print out: " << exp << endl;
   cout << listToString(list) << endl;
   if (listToString(list) != exp) {cout << "FAILED" << endl;}
   cout << "------------------------------------------------------------------------" << endl;
}

void testInsertAt(){
   testInsertAtUnit("2 7 3", 44, 0, "(44 2 7 3)"); 
   testInsertAtUnit("2 7 3", 44, 1,  "(2 44 7 3)");
   testInsertAtUnit("2 7 3", 44, 2, "(2 7 44 3)");
   testInsertAtUnit("2 7 3", 44, 3, "(2 7 3 44)");
   testInsertAtUnit("2 7 3", 44, 86, "(2 7 3 44)");
   testInsertAtUnit("1", 44, 0, "(44 1)");
   testInsertAtUnit("", 44, 5, "(44)");
}

int main ()
{
   cout << "Start test(print \"FAILED\" once output mismatches expected ones): " << endl << endl;
   testInsertAt();
   return 0;
}





/*********************************************************
 * Utility function definitions
 *
 */
string listToString(ListType list) {

   string listString = "(";

   if (list == NULL) {
      listString += ")";
      return listString;
   }

   Node *p = list;
   while (p->next != NULL) {
      listString += to_string(p->data) + " ";
      p = p->next;
   }

   // print last one with no trailing space
   listString += to_string(p->data) + ")";

   return listString;

}   


ListType buildList(const string & listString) {

   ListType nums = NULL;

   istringstream istr(listString);  // similar to a Java Scanner over a String

   int num;

   if (istr >> num) { // is there one value there?
      nums = new Node(num);
   }
   else {
      return NULL;
   }

   Node *last = nums;

   while (istr >> num) { 
      last->next = new Node(num);
      last = last->next;
   }

   return nums;
}
