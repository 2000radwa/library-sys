# include<iostream>
using namespace std;
void round(int* grades,int size)
{
	for (int i = 0; i < size; i++) 
	{   
	
		while (grades[i] > 37 && grades[i] < 40) {
		
			grades[i] += 1;
		
		}
		if (grades[i] < 38) {}
		for (int i = 0; i <size; i++)
		{
			if (grades[i] >= 38 && (grades[i] % 5) > 2)
			{
				grades[i] = grades[i] + 5 - grades[i] % 5;
			}
	}
	}
	
	
}
int main()
{
	int Number,min,max,i;
	cin >> Number;
	int *grades = new int[Number];
	cout << "enter the array" << endl;
	for ( i = 0; i < Number; i++)
		cin >> grades[i];
	cout << Number<<endl;
	for (i = 0; i < Number; i++)
		cout<< grades[i]<<endl;
	round(grades, Number);
	for (i = 0; i < Number; i++)
		cout << grades[i]<<endl;
 return 0;
}