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

int gut(ListType list){
   if (list == NULL){
      return 0;
   }
   int max = 1;
   while(list != NULL){
      Node * p = list->next;
      int cnt = 1;
      while(p != NULL && p->data == list->data){
         p = p->next;
         cnt++;
      }
      if(cnt > max){
         max = cnt;
      }
      list = p;
   }
   return max;
}