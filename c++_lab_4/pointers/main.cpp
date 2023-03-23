#include <iostream>
#include <string>
#include "Func.h"
using namespace std;

int main()
{
  string inputString;
  cout << "Enter Name" << endl;
  cin >> inputString;

  readString(inputString);

  return 0;
}