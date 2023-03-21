#include <iostream>
#include <string>
using namespace std;

// char* transformStringToArray(string inputString)
// {
//   char* arrChar = new char[inputString.length()];

//   for (int i = 0; i < inputString.length(); i++)
//   {
//     arrChar[i] = inputString[i];
//   }
// }

// void groupAlpha(char array[], int length) {
//  for(int i=0;i<length;i++){
//   cout<<array[i]<<endl;
//  }
// }

int main()
{
  string inputString;
  string word;
  cout << "Enter hyphenated string" << endl;
  cin >> inputString;

  string words[100];

  int length = inputString.length();

  char arrayedString[length];

  int i = 0;

  while (inputString[i] != inputString.back())
  {
    if (inputString[i] != '-' || inputString[i] == inputString.back())
      i++;
    cout << word << endl;
  }

  // for (int i = 0; i < length; i++)
  // {
  //   if (inputString[i] == '-')
  //   {
  //     cout << word << endl;

  //     word = "";
  //     continue;
  //   }
  //   else if (inputString[i] == inputString.back())
  //   {

  //   }
  //   word += inputString[i];
  //   cout << word << endl;
  // }

  // for (int i = 0; i < length; i++)
  // {
  //   if (arrayedString[i] == '-')
  //   {
  //     cout << word << endl;
  //     word = "";
  //     continue;
  //   }
  //   word += arrayedString[i];
  //   // cout << word << endl;
  // }
  // cout << arrayedString['\0'] << endl;
  return 0;
}