array=[10, 4, 23, 99, 7, 2, 1, 11, 44, 15]
print("Unsorted array: ")
for i in range(0,10):
	print("{} ".format(array[i]))
#Sort array using bubblesort
a=len(array)
for x in range(a):
	for y in range(0, a-x-1):
		if array[y] < array[y+1]:
			temp=array[y]
			array[y]=array[y+1]
			array[y+1]=temp
print("Sorted array: ")
for j in range(0,10):
	print("{} ".format(array[j]))
	
#compile using 'python3 sort.py"
