//Pass by Reference
#include <iostream>

void swap(int& a, int& b){
	int c=a;
	a=b;
	b=c;
}

int main(){
	int x=10;
	int y=50;
	std::cout << "Values before swap" << std::endl;
	std::cout << "X: " << x << "   " << "Y: " << y << std::endl;
	swap(x,y);
	std::cout << "Values after swap" << std::endl;
	std::cout << "X: " << x << "   " << "Y: " << y << std::endl;
	return 0;
}