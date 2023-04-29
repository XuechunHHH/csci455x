// Name: Xuechun Hua
// USC NetID: xuechunh
// CSCI 455 PA5
// Spring 2023

#include <iostream>

#include <cassert>

#include "listFuncs.h"

using namespace std;

Node::Node(const string &theKey, int theValue)
{
   key = theKey;
   value = theValue;
   next = NULL;
}

Node::Node(const string &theKey, int theValue, Node *n)
{
   key = theKey;
   value = theValue;
   next = n;
}

//*************************************************************************
// put the function definitions for your list functions below

/**
 *  Find the Node in the linked list by key and return the node
 *  else return null
 */
Node* findNode(ListType nodeList, const std::string &theKey)
{
   while (nodeList != NULL)
   {
      if (nodeList->key == theKey)
      {
         return nodeList;
      }
      else
      {
         nodeList = nodeList->next;
      }
   }
   return NULL;
}

/**
 * Get the length of the linked list
 */
unsigned int listSize(ListType nodeList)
{
   unsigned int size = 0;
   while (nodeList != NULL)
   {
      size++;
      nodeList = nodeList->next;
   }
   return size;
}

/**
 * When the node doesn't exist in the linked list, add the node to last and return true
 * else return false
 */
bool addNode(ListType &nodeList, const std::string &theKey, int theValue)
{
   if (findNode(nodeList, theKey) != NULL)
   {
      return false;
   }
   if (nodeList == NULL)
   {
      nodeList = new Node(theKey, theValue);
   }
   else
   {
      Node *p = nodeList;
      while (p->next != NULL)
      {
         p = p->next;
      }
      p->next = new Node(theKey, theValue);
   }
   return true;
}

/**
 * Remove the node by key and return true when it is in the linked list
 * else return false
 */
bool removeNode(ListType &nodeList, const std::string &theKey)
{
   if (findNode(nodeList, theKey) == NULL)
   {
      return false;
   }
   if (nodeList->key == theKey)
   {
      Node *temp = nodeList;
      nodeList = nodeList->next;
      temp->next = NULL;
      delete temp;
   }
   else
   {
      Node *p = nodeList;
      while (p->next->key != theKey)
      {
         p = p->next;
      }
      Node *temp = p->next;
      p->next = temp->next;
      temp->next = NULL;
      delete temp;
   }
   return true;
}

/**
 * Print out the linked list
 */
void printNodeList(ListType nodeList, std::ostream &out)
{
   while (nodeList != NULL)
   {
      out << nodeList->key << " " << nodeList->value << endl;
      nodeList = nodeList->next;
   }
}