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
