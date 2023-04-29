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
Node::Node(int item) { 
   data = item;
   next = NULL;
}

Node::Node(int item, Node *n) {
   data = item;
   next = n;
}
// *********************************************************


bool allUnique(ListType list) {
   if (list == NULL){
      return true;
   }
   Node *p = list;
   while(p->next != NULL){
      Node *pc = p->next;
      while(pc != NULL){
         if (p->data == pc->data){
            return false;
         }
         pc = pc->next;
      }
      p = p->next;
   }
   return true;
}


ListType merge(ListType list1, ListType list2) {
   ListType list = NULL;
   Node *p = list;
   while(list1 != NULL && list2 != NULL){
      if (list1->data <= list2->data){
         if(list == NULL){
            list = new Node(list1->data);
            p = list;
            list1 = list1->next;
         } else {
            p->next = new Node(list1->data);
            p = p->next; 
            list1 = list1->next;
         }
      } else {
         if(list == NULL){
            list = new Node(list2->data);
            p = list;
            list2 = list2->next;
         } else {
            p->next = new Node(list2->data);
            p = p->next; 
            list2 = list2->next;
         }
      }
   }

   while(list1 != NULL){
      if(list == NULL){
         list = new Node(list1->data);
         p = list;
         list1 = list1->next;
      } else {
         p->next = new Node(list1->data);
         p = p->next; 
         list1 = list1->next;
      }
   }

   while(list2 != NULL){
      if(list == NULL){
         list = new Node(list2->data);
         p = list;
         list2 = list2->next;
      } else {
         p->next = new Node(list2->data);
         p = p->next; 
         list2 = list2->next;
      }
   }  

   return list;
}


void triSum(ListType & list) {
   ListType tri = NULL;
   Node *trip = tri;
   Node *p = list;
   int cnt = 0;
   while(p != NULL){
      cnt ++;
      p = p->next;
   }
   p = list;
   for (int i = 0; i < cnt/3; ++i){
      int sum = 0;
      for (int j = 0; j < 3; ++j){
         sum += p->data;
         p = p->next; 
      }
      if(tri == NULL){
         tri = new Node(sum);
         trip = tri;
      } else {
         trip->next = new Node(sum);
         trip = trip->next;
      }
   }
   if (p != NULL){
      int sum = 0;
      while(p != NULL){
         sum += p->data;
         p = p->next;
      }
      if(tri == NULL){
         tri = new Node(sum);
         trip = tri;
      } else {
         trip->next = new Node(sum);
         trip = trip->next;
      }
   }
   delete list;
   list = tri;
}


