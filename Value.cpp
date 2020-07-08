//Pass by Value
#include <iostream>

void swap(int a, int b){
	std::cout << "Values swapped inside of swap function" << std::endl;
	int c=a;
	a=b;
	b=c;
	std::cout << "X: " << a << "   " << "Y: " << b << std::endl;
}

int main(){
	int x=25;
	int y=68;
	std::cout << "Values before swapping" << std::endl;
	std::cout << "X: " << x << "   " << "Y: " << y << std::endl;
	swap(x,y);
	std::cout << "Values outside of swap function" << std::endl;
	std::cout << "X: " << x << "   " << "Y: " << y << std::endl;
}