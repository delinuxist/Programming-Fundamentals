#include <iostream>
using namespace std;

int main() {
	int number;
	int counter = 0;
	int count = 1;

	cout<<"Enter number"<<endl;
	cin>>number;

	if(number % 2 == 0) {
		for(int i=1;i<=20;i++){
			cout<<i<<" x "<<number<<" = "<<i*number<<endl;
		}
	} else {
		while(counter < 30){
			if(count%number != 0){
				cout<<count<<endl;
				counter++;
			}
		count++;	
		}
	}

}
