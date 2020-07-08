#include <stdio.h>
#include <iostream>

//Using a static int in C++
int addToStatic(int i)
{
	for(int a=0; a<10; a++)
	{
		i=i+1;
		std::cout << "Increased value by 1, value of x is now: " << i << std::endl;
	}
	return i;
}

int main(){
	static int x=0;
	std::cout << "The current value of the static int is: " << x << std::endl;
	x=x+1;
	std::cout << "Adding 1 to x in the main function results in: " << x << std::endl;
	std::cout << "Passing x into a function that loops 10 times." << std::endl;
	x=addToStatic(x);
	x=x+1;
	std::cout << "Add one more to show value stays after leaving function, making x=:" << x << std::endl;
	x=addToStatic(x);
	x=x+1;
	std::cout << "Add one more to show value stays after leaving function, making x=:" << x << std::endl;
	return 0;
}