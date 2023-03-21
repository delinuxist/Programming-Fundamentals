#include <iostream>
using namespace std;

int main()
{
  int value = 5;
  int *ptr = &value;
  int &ref_value = value;
  const int age = 25;

  (*ptr)++;
  ref_value++;

  cout << "Integer Value " << value << endl;

  auto a{0xf3f2};
  auto b{0437};
  auto c{'a'};

  cout << a << endl;
  cout << b << endl;
  cout << c << endl;

  return 0;
}