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

int numRuns(ListType list){
   int cnt = 0;
   while(list != NULL && list->next != NULL){
      Node * p = list->next;
      while(p != NULL){
         if (p->data == list->data){
            p = p->next;
         } else {
            break;
         }
      }
      if (list->next != p){
         cnt ++;
      }
      list = p;
   }
   return cnt;
}