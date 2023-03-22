#include <iostream>
#include <string>

using namespace std;

int main()
{
  string inputString;
  cout << "Enter characters" << endl;
  cin >> inputString;

  int count = 0;
  int i = 0;

  while (i < inputString.length())
  {
    if (inputString[i] == '?')
    {
      ++count;
    }
    i++;
  }

  cout << "Number of counts: " << count << endl;
}