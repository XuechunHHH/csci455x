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

void removeuntil7(ListType & list){
   Node * p = list;
   while (p != NULL){
      if(p->data != 7){
         Node * temp = p;
         p = p->next;
         delete temp;
      } else {
         break;
      }
   }
   list = p;
}