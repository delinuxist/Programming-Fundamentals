#include <iostream>
using namespace std;

// sort array function
int * sorted(int array[5]) {
	for (int i=0; i<5;i++){
		for(int j=i+1; j<5;j++){
			if(array[i] > array[j]){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}	
	}
	return array;
}

int mode(int array[5]) {
	int numCount[5];
	int *tempCount;
	int counter = 0;
	int mode;

// using for loop to count number occurences and store in numCount array
for(int i=0;i<5;i++){
	counter = 0;
	for(int j=0;j<5;j++){
		if(array[i] == array[j]){
			counter++;
		}
		numCount[i] = counter;
	}
} 

// assigning numCount to tempCount
tempCount = numCount;

// loop through the tempCount to find the highest occurence number
for(int i=0;i<5;i++){
	if(tempCount[0] < tempCount[i]){
		tempCount[0] = tempCount[i];
	}
}

// loop through numCount for most occurence index and insert index in array
for(int i=0;i<5;i++){
	if(numCount[i] == tempCount[0]){
		mode = array[i];
		break;
	}
}

return mode;
}

// median function
int median(int array[5]) {
	int value;
	for(int i=0;i<5;i++) {
		if(i == 2){
		 value=array[i];
		}
	}
	return value;
}

int main() {
	int numsArray[5];
	int *sortedArray;
	int sum = 0;

// using for loop to get user input
for(int i=0;i<5;i++){
	cout<<"Enter num"<<i<<endl;
	cin>>numsArray[i];
}

// total sum of numbers in the array
for(int i =0;i<5;i++){
	sum+=numsArray[i];
}

	double mean = sum/5.0;

	//storing the sorted array in sortedArray variable
	sortedArray = sorted(numsArray);

	int modeValue = mode(sortedArray);

	int medianValue = median(sortedArray);


	cout<<"Mean "<<mean<<endl;
	cout<<"Mode "<<modeValue<<endl;
	cout<<"Median "<<medianValue<<endl;

	return 0;
}	
