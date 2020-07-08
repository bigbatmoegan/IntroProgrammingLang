#include <iostream>

template <class Square>
Square getArea (Square x){
	Square area;
	area=x*x;
	return area;
}

int main(){
	int a=5;
	int b=10;
	int area1=0;
	int area2=0;
	area1=getArea<int>(a);
	area2=getArea<int>(b);
	std::cout << "when x is 5, area is " << area1 << std::endl;
	std::cout << "when x is 10, area is " << area2 << std::endl;
	return 0;
}