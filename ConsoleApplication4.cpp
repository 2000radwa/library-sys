# include<iostream>
using namespace std;
void swap(int* arr,int size,int min,int max)
{
	for (int i = 0; i < size; i++)
	{
		if (arr[i] == max)
		{
			arr[i] = min;
		}
		else if (arr[i] == min)
		{
			arr[i] = max;
		}
	}
	
}
int main()
{
	int Number,min,max,i;
	cin >> Number;
	int *arr = new int[Number];
	cout << "enter the array" << endl;
	for ( i = 0; i < Number; i++)
		cin >> arr[i];
	cout << Number<<endl;
	for ( i = 0; i < Number; i++)
	{
		cout << arr[i];
	}
	min = arr[0];
	for (i = 0; i < Number; i++)
	{
		if (min > arr[i])
			min = arr[i];
	}
	max = arr[0];
	for ( i = 0; i < Number; i++)
	{
		if (max < arr[i])
			max = arr[i];
		
	}
	swap(arr, Number, min, max);
 
 cout << "array after swaping" << endl;
 for (int i = 0; i < Number ; i++)
 {
	 cout << arr[i];
 }
 return 0;
}