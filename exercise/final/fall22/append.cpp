#include <iostream>
#include <cstring>

using namespace std;

void append(char * dest, const char * source){
   int dlen = strlen(dest);
   int slen = strlen(source);
   for (int i = dlen; i < dlen + slen; ++i){
      dest[i] = source[i - dlen];
   }
   dest[dlen + slen] = '\0';
}

int main(){
   char *str = new char[50];
   strcpy(str, "egg");
   append(str, "shell");
   cout << "'" << str << "'" << endl;
   return 0;
}