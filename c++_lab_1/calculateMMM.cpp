#include <iostream>
using namespace std;

// sort array function
int * sorted(int array[5]) {
	for (size_t i=0; i<5;i++){
		for(size_t j=i+1; j<5;j++){
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
	int mode;

// using for loop to count number occurrences and store in numCount array
for(size_t i=0;i<5;i++){
	int counter = 0;
	for(size_t j=0;j<5;j++){
		if(array[i] == array[j]){
			counter++;
		}
		numCount[i] = counter;
	}
} 

// assigning maxOccurrence to the first value in numCount array
int maxOccurrence = numCount[0];

// loop through the numCount to find the highest occurrence number
for(size_t i=0;i<5;i++){
	if(maxOccurrence < numCount[i]){
		maxOccurrence = numCount[i];
	}
}

// loop through numCount for most occurrence index and insert index in array
for(size_t i=0;i<5;i++){
	if(numCount[i] == maxOccurrence){
		mode = array[i];
		break;
	}
}

return mode;
}

// median function
int median(int array[5]) {
	int value;
	for(size_t i=0;i<5;i++) {
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
for(size_t i=0;i<5;i++){
	cout<<"Enter num"<<i+1<<endl;
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
