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

void gut(ListType & list){
   if (list == NULL || list->next == NULL){
      return;
   }
   Node * p = list;
   while(p->next->next != NULL){
      Node * temp = p->next;
      p->next = temp->next;
      delete temp;
   }
}