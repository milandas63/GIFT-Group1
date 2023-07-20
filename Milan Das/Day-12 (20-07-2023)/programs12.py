"""
	Write a program to reverse a string?
		ORIGINAL: Quick Brown Fox Jumps Over The Lazy Dog
		REVERSE:  goD yzaL ehT revO spmuJ xoF nworB kciuQ
"""

original = "Quick Brown Fox Jumps Over The Lazy Dog"
reverse = ""

for x in range(len(original)-1, -1, -1):
	reverse = reverse+original[x]

print("ORIGINAL: "+"Quick Brown Fox Jumps Over The Lazy Dog")
print("REVERSE:  "+reverse)

print()
print("--------------------------------- Next ----------------------------------")

olist = original.split()
length = len(olist)
for i in range(length-1, -1, -1):
	print(olist[i], end=" ")

print()
print("--------------------------------- Next ----------------------------------")

for i in range(0, len(olist)):
	reverse = ""
	word = olist[i]
	for j in range(len(word)-1, -1, -1):
		reverse = reverse+word[j]
	print(reverse, end=" ")

print()
print("--------------------------------- Next ----------------------------------")

# Stretch a string to change the justification
data = "God is good"
print(data.rjust(50,'.'))
print(data.center(50,'.'))
print(data.ljust(50,'.'))

print()
print("--------------------------------- Next ----------------------------------")

start = 2
end = 10
for i in range(2, end+1, 5):
	for j in range(1, 11):
		for k in range(i, i+5):
			if k>end:
				break
			#print(padL(k,2),"x",padL(j,2),"=",padL((k*j),3)," ", end='')
			print(str(k).rjust(2,' '),"x",str(j).rjust(2,' '),"=",str(k*j).rjust(3,' ')," ", end='')
		print()
	print()

print()
print("--------------------------------- Next ----------------------------------")

"""
>>> import keyword
>>> print(keyword.kwlist)
['False', 'None', 'True', 'and', 'as', 'assert', 'async', 'await', 'break',
 'class', 'continue', 'def', 'del', 'elif', 'else', 'except', 'finally', 
 'for', 'from', 'global', 'if', 'import', 'in', 'is', 'lambda', 'nonlocal',
 'not', 'or', 'pass', 'raise', 'return', 'try', 'while', 'with', 'yield']
>>>
"""

# Write a program to print the count of each alphabet in a string?
text = "God is Good"
text = "Sudhansu Swayam Rout"
alpha = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

for i in range(0, len(text)):
	each = text[i]
	asc = ord(each)
	if asc>=65 and asc<=90:
		alpha[asc-65] = alpha[asc-65]+1
	elif asc>=97 and asc<=122:
		alpha[asc-97] = alpha[asc-97]+1

for i in range(0, len(alpha)):
	if alpha[i]>0:
		print( chr(i+65),' = ',alpha[i] )

print()
print("--------------------------------- Next ----------------------------------")

# 6 algorithmic question solved using python
# Learnt function like dir, str, kwlist, rjust, ljust, center, ord, chr

"""
1.  Write a function that takes a list of strings and prints them, one per line, in a 
	rectangular frame.
    For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:
        *********
        * Hello *
        * World *
        * in    *
        * a     *
        * frame *
        *********

2. write the pyramid program using rjust() function?

"""
