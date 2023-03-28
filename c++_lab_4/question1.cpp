#include <iostream>
#include <iostream>
using namespace std;

void printCharacters(const char[], int);

int main()
{
  string inputString;
  const char *arrayString;

  cout << "Enter string" << endl;
  cin >> inputString;

  int length = inputString.length();

  arrayString = inputString.c_str();

  printCharacters(arrayString, length);

  return 0;
}

void printCharacters(const char words[], int length)
{
  for (int i = 0; i < length; i++)
  {
    cout << "Character: " << words[i] << endl;
  }
}
