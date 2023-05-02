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

void testUniqueUnit(string str, string exp, bool boolean){
   ListType list = buildList(str);
   cout << "Expected print out: " << exp <<" "<< boolean << endl;
   cout << listToString(list) << " " << allUnique(list) << endl;
   if (allUnique(list) != boolean) {cout << "FAILED" << endl;}
   cout << "------------------------------------------------------------------------" << endl;
}

void testUnique(){
   cout << endl << "Test allUnique() function: " << endl;
   testUniqueUnit("3 4 -5", "(3 4 -5)", true);
   testUniqueUnit("6 7 3 6 4 5", "(6 7 3 6 4 5)", false);
   testUniqueUnit("3 3", "(3 3)", false);
   testUniqueUnit("", "()", true);
   testUniqueUnit("5", "(5)", true);
}

void testMergeUnit(string str1, string str2, string exp){
   ListType list1 = buildList(str1);
   ListType list2 = buildList(str2);
   cout << "list1: " << listToString(list1) << ", list2: " << listToString(list2) << endl;
   cout << "Expected print out: " << exp << endl;
   cout << listToString(merge(list1,list2)) << endl;
   if (listToString(merge(list1,list2)) != exp){cout << "FAILED" << endl;}
   cout << "------------------------------------------------------------------------" << endl;
}

void testMerge(){
   cout << endl << "Test merge() function: " << endl;
   testMergeUnit("1 3 5", "2 4 6", "(1 2 3 4 5 6)");
   testMergeUnit("2 3 6", "1 3 5", "(1 2 3 3 5 6)");
   testMergeUnit("1 3 3 3 5", "2 6", "(1 2 3 3 3 5 6)");
   testMergeUnit("", "1 3", "(1 3)");
   testMergeUnit("1 3", "", "(1 3)");
   testMergeUnit("", "", "()");
}

void testTriSumUnit(string str, string exp){
   ListType list = buildList(str);
   cout << "Origin list: " << listToString(list) << endl;
   triSum(list);
   cout << "Expected print out: " << exp << endl;
   cout << listToString(list) << endl;
   if (listToString(list) != exp) {cout << "FAILED" << endl;}
   cout << "------------------------------------------------------------------------" << endl;
}

void testTriSum(){
   cout << endl << "Test triSum() function: " << endl;
   testTriSumUnit("3 4 -5", "(2)"); 
   testTriSumUnit("6 7 6 3 4 5", "(19 12)");
   testTriSumUnit("","()");
   testTriSumUnit("0 1 2 3 4 5 6 7 8","(3 12 21)");
}

int main ()
{
   cout << "Start test(print \"FAILED\" once output mismatches expected ones): " << endl << endl;
   testTriSum();
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
