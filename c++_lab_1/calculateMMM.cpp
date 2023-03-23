#include <iostream>
using namespace std;

// sort array function
void sorted(int array[], int *length)
{
	for (size_t i = 0; i < *(length); i++)
	{
		for (size_t j = i + 1; j < *(length); j++)
		{
			if (array[i] > array[j])
			{
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
}

int mode(int array[], int &length)
{
	int numCount[length];
	int mode;

	// using for loop to count number occurrences and store in numCount array
	for (size_t i = 0; i < length; i++)
	{
		int counter = 0;
		for (size_t j = 0; j < length; j++)
		{
			if (array[i] == array[j])
			{
				counter++;
			}
			numCount[i] = counter;
		}
	}

	// assigning maxOccurrence to the first value in numCount array
	int maxOccurrence = numCount[0];

	// loop through the numCount to find the highest occurrence number
	for (size_t i = 0; i < length; i++)
	{
		if (maxOccurrence < numCount[i])
		{
			maxOccurrence = numCount[i];
		}
	}

	// loop through numCount for most occurrence index and insert index in array
	for (size_t i = 0; i < length; i++)
	{
		if (numCount[i] == maxOccurrence)
		{
			mode = array[i];
			break;
		}
	}

	return mode;
}

// median function
int median(int array[], int &length)
{
	int value;
	for (size_t i = 0; i < length; i++)
	{
		if (i == 2)
		{
			value = array[i];
		}
	}
	return value;
}

int main()
{
	int numsArray[5];
	int sum = 0;

	int length = sizeof(numsArray) / sizeof(numsArray[0]);

	// using for loop to get user input
	for (size_t i = 0; i < length; i++)
	{
		cout << "Enter num" << i + 1 << endl;
		cin >> numsArray[i];
	}

	// total sum of numbers in the array
	for (int i = 0; i < length; i++)
	{
		sum += numsArray[i];
	}

	double mean = sum / 5.0;

	// sorting the array;
	sorted(numsArray, &length);

	for (int a : numsArray)
	{
		cout << a << endl;
	}

	int modeValue = mode(numsArray, length);

	int medianValue = median(numsArray, length);

	cout << "Mean " << mean << endl;
	cout << "Mode " << modeValue << endl;
	cout << "Median " << medianValue << endl;

	return 0;
}
