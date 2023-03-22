#include <iostream>
#include <string>
using namespace std;

int main()
{
  int firstOperand;
  int secondOperand;
  char operatorValue;

  cout << "Please input two operands: ";
  cin >> firstOperand;
  cin >> secondOperand;

  cout << "Please input an operator: ";
  cin >> operatorValue;

  switch (operatorValue)
  {
  case '+':
    cout << "Adding " << firstOperand << " and " << secondOperand << " = " << firstOperand + secondOperand << endl;
    break;
  case '*':
    cout << "Multiplying " << firstOperand << " and " << secondOperand << " = " << firstOperand * secondOperand << endl;
    break;
  default:
    cout << "Wrong operator entered" << endl;
    break;
  }

  return 0;
}