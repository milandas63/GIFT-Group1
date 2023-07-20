name = "Manohar"
father = "Judister"
gender = "Male"
age = 34

def reverse(data):
	rValue = ""
	for i in range(len(data)-1, -1, -1):
		rValue = rValue+data[i]
	return rValue

print(reverse("Hello"))
