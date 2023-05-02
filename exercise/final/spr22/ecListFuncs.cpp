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

void triSum(ListType &list)
{
   Node *p = list;
   int cnt = 0;
   while(p != NULL){
      cnt ++;
      p = p->next;
   }
   p = list;
   for (int i = 0; i < cnt/3;i++){
      p->data = p->data + p->next->data + p->next->next->data;
      Node *temp1 = p->next;
      Node *temp2 = p->next->next;
      p->next = p->next->next->next;
      delete temp1;
      delete temp2;
      p = p->next;
   }
}