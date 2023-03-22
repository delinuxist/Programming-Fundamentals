#include <iostream>
#include <string>

using namespace std;

int main()
{
  char c;
  string text = "";
  string reversedString = "";
  char array[5];
  int i;

  cout << "Enter text" << endl;
  while (cin.get(c))
  {
    if (c == '\n')
    {
      break;
    }
    text += c;
  }

  for (int i = text.length() - 1; i >= 0; i--)
  {
    reversedString += text[i];
  }

  cout << "Reversed String: " << reversedString << endl;
}