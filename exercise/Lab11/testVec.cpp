#include <iostream>
#include <vector>

using namespace std;
vector<int> readVals();
void printVals(vector<int> v);
vector<int> valsPos(vector<int> v);

int main()
{
   vector<int> nums;
   vector<int> pos;
   nums = readVals();
   pos = valsPos(nums);
   cout << "Vector: ";
   printVals(nums);
   cout << "Filtered vector: ";
   printVals(pos);
   cout << "Original vector: ";
   printVals(nums);
   return 0;
}

vector<int> readVals()
{
   vector<int> v;
   int num;
   while (cin >> num)
   {
      v.push_back(num);
   }
   return v;
}

void printVals(vector<int> v)
{
   for (vector<int>::size_type i = 0; i < v.size(); ++i){
      cout << v[i] << " ";
   }
   cout << endl;
}

// return all positive values in v
vector<int> valsPos(vector<int> v){
   vector<int> pos;
   for (vector<int>::size_type i = 0; i < v.size();++i){
      if (v[i] > 0){
         pos.push_back(v[i]);
      }
   }
   return pos;
}