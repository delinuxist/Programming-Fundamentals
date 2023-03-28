#include <iostream>
#include <string>
using namespace std;

namespace my
{
  int strcmp(const char *l, const char *r)
  {
    return 0;
  }

  int strlen(const char *s)
  {
    return 0;
  }
}

struct CarData
{
  char req[8];
  int year;
};

int main()
{
  CarData mine, yours;
  mine.year = 20;
  yours.year = 10;

  cout << mine.year << endl;
  cout << yours.year << endl;
}