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

  if (inputString.back() != '-')
  {
    inputString.append("-");
  }

  for (int i = 0; i < inputString.length(); i++)
  {
    if (inputString[i] == '-')
    {
      cout << "[" << word.length() << "] " << word << endl;
      word = "";
      continue;
    }

    word += inputString[i];
  }

  return 0;
}