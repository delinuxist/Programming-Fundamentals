#include <iostream>
using namespace std;

int * sorted(int array[4]) {
	int number;
	int counter =0;
	for (int i=0; i<=4;i++){
		for(int j=i+1; j<=4;j++){
			if(array[i] > array[j]){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;

			}
		}	
	}
	for(int i=0;i<=4;i++){
		cout<<array[i]<<endl;
	}
	return array;
}

int mode(int array[4]) {
cout<<"Inside Mode"<<endl;
for(int i=0;i<=4;i++){
	cout<<array[i]<<endl;
} 
return 0;
}

int median(int array[4]) {
	int value;
	for(int i=0;i<=4;i++) {
		if(i == 2){
		 value=array[i];
		}
	}
	return value;
}

int main() {
	int numsArray[4];
	int *sortedArray;
	int sum = 0;

	cout<<"Enter num1"<<endl;
	cin>>numsArray[0];
	cout<<"Enter num2"<<endl;
	cin>>numsArray[1];
	cout<<"Enter num3"<<endl;
	cin>>numsArray[2];
	cout<<"Enter num4"<<endl;
	cin>>numsArray[3];
	cout<<"Enter num5"<<endl;
	cin>>numsArray[4];

	for(int i =0;i<=4;i++){
		sum+=numsArray[i];
	}

	double mean = sum/5;

	sortedArray = sorted(numsArray);
	mode(sortedArray);
	int medianValue = median(sortedArray);

	cout<<"Mean "<<mean<<endl;
	//cout<<"Mode "<<mode<<endl;
	cout<<"Median "<<medianValue<<endl;

	return 0;
}	
