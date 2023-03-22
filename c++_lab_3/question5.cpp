#include <iostream>
#include <string>
using namespace std;

int main()
{
  char c;
  string text;
  string word;
  string combinedString;
  string longestWord;
  int highest;
  cout << "Enter text" << endl;

  while (cin.get(c))
  {
    if (c == '\n')
    {
      break;
    }
    text += c;
  }

  int length = text.length();

  char arrChar[length];

  for (int i = 0; i < length; i++)
  {
    combinedString += text[i];
  }

  combinedString += ' ';

  for (int i = 0; i < combinedString.length(); i++)
  {
    if (combinedString[i] == ' ')
    {
      if (word.length() > highest)
      {
        highest = word.length();
        longestWord = word;
      }
      cout << "[" << word.length() << "] " << word << endl;
      word = "";
      continue;
    }

    word += combinedString[i];
  }

  cout << "longest word is: " << longestWord << " and length is: " << highest << endl;
}