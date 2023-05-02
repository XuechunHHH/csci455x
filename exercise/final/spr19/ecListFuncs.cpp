/*  Name: Xuechun Hua
 *  USC NetID: xuechunh
 *  CS 455 Spring 2023
 *
 *  See ecListFuncs.h for specification of each function.
 */

#include <string>
#include <cassert>

#include "ecListFuncs.h"

using namespace std;

// *********************************************************
// Node constructors: do not change
Node::Node(int item)
{
   data = item;
   next = NULL;
}

Node::Node(int item, Node *n)
{
   data = item;
   next = n;
}
// *********************************************************

void insertAt(ListType & list, int val, int loc){
   Node * p = list;
   if (loc == 0){
      list = new Node(val,p);
      return;
   }
   if (p == NULL){
      list = new Node(val);
      return;
   }
   int cnt = loc-1;
   int i = 0;
   while(p->next != NULL && i<cnt){
      p = p->next;
      i++;
   }
   Node * temp = new Node(val,p->next);
   p->next = temp;
}