import random
number=random.randint(1,6)
print("Welcome to a cheap dice roller.")
roll=input("Enter "'roll'" to roll a 6 sided dice. ")
if roll == 'roll':
	print("You rolled a {}.".format(number))
else:
	print("why did you not enter roll. I'm closing the program bye.")
