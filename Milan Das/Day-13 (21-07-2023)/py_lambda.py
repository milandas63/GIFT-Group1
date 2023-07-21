"""
	LAMBDA FUNCTION
	>	A lambda function is a small anonymous function.
	>	A lambda function can take any number of arguments, but can only have 
		one expression.

	WHY USE LAMBDA FUNCTIONS?
	>	The power of lambda is better shown when you use them as an anonymous 
		function inside another function.
	>	Say you have a function definition that takes one argument, and that 
		argument will be multiplied with an unknown number:

	QUESTION-1
	Write a program to calculate the simple interest value of 10,000
		>	Year = 3, Rate = 6.0
		>	Year = 5, Rate = 5.5
		>   Year = 8, Rate = 3.5
		Use Lambda function to evaluate the above problem

	Simple_interest = (principal * rate_of_interest * time_in_year)/100

	QUESTION-2
	

"""
def myfunc(days):
  return lambda age : age * days

earth_total_days = myfunc(365)
print("Total Days in Earth:", earth_total_days(19))

jupiter_total_days = myfunc(530)
print("Total Days in Jupiter:", jupiter_total_days(21))


full_name = lambda first_name, last_name : first_name + " " + last_name
print(full_name("Naveen", "Patnaik"))



def SimpleInterestRate(time):
	if time<=3:
		interest_amount_func = lambda principal : (principal * 6.0 * time) / 100
	elif time<=5:
		interest_amount_func = lambda principal : (principal * 5.5 * time) / 100
	elif time<=8:
		interest_amount_func = lambda principal : (principal * 3.5 * time) / 100

	return interest_amount_func;

sir = SimpleInterestRate(4)
print(sir(4000))
print(sir(3000))
print(sir(8500))

