#include <iostream>
#include <string>
using namespace std;

int main()
{
  enum
  {
    RED,
    YELLOW,
    AMBER = YELLOW,
    GREEN
  };
  int color;
  cout << "Only Input the these numbers (0,1,2)" << endl;
  cout << "Enter color" << endl;
  cin >> color;

  switch (color)
  {
  case RED:
    cout << "You chose Red" << endl;
    break;
  case YELLOW:
    cout << "You chose Yellow" << endl;
    break;
  case GREEN:
    cout << "You chose Green" << endl;
    break;
  default:
    cout << "Enter a wrong number" << endl;
    break;
  }
}