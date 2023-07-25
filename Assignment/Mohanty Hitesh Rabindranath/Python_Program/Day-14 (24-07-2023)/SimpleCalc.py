# Simple Calculator
# -----------------

add = lambda x, y : x + y
minus = lambda x, y : x - y
multiply = lambda x, y : x * y
divide = lambda x, y : x / y

loop = True
while(loop):
	for i in range(0,10):
		print()
	
	print("Simple Calculator")
	print("-----------------")
	print()
	print("1. Addition")
	print("2. Substraction")
	print("3. Multiplication")
	print("4. Division")
	print("5. Exit")
	print()
	print()

	action = input("What to do? ")
	if action=='5':
		break

	first =  int(input("Enter first number:  "))
	second = int(input("Enter second number: "))
	if action=='1':
		print(add(first, second))
	elif action=='2':
		print(minus(first, second))
	elif action=='3':
		print(multiply(first, second))
	elif action=='4':
		print(divide(first, second))

	print()
	print()
	loop = input("More? [y/n] ")=='y'


"""
OUTPUT:
Simple Calculator
-----------------

1. Addition
2. Substraction
3. Multiplication
4. Division
5. Exit


What to do? 1
Enter first number:  46
Enter second number: 64
110


More? [y/n] y
Simple Calculator
-----------------

1. Addition
2. Substraction
3. Multiplication
4. Division
5. Exit


What to do? 2
Enter first number:  35
Enter second number: 12
23


More? [y/n] y
Simple Calculator
-----------------

1. Addition
2. Substraction
3. Multiplication
4. Division
5. Exit


What to do? 3
Enter first number:  84
Enter second number: 65
5460


More? [y/n] y
Simple Calculator
-----------------

1. Addition
2. Substraction
3. Multiplication
4. Division
5. Exit


What to do? 4
Enter first number:  59
Enter second number: 78
0.7564102564102564


More? [y/n] n
"""
