"""
     Write a python program to print a pyramid of pallindrom numbers?
                                   1
                                  121
                                 12321
                                1234321
                               123454321
                              12345654321
                             1234567654321
                            123456787654321
                           12345678987654321
"""

space = 35
for x in range(1,10):
	for y in range(0,space):
		print(" ",end="")
	for y in range(1,x+1):
		print(y,end="")
	for y in range(x,x>0,-1):
		print(y-1,end="")
	print()
	space-=1