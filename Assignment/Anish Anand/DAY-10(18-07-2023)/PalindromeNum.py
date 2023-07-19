sp = 40
for x in range(0,10):
	for y in range(1,sp+1):
		print(" ",end="")
	for y in range(1,x+1):
		print(y,end="")
	for y in range(x-1, 0, -1):
		print(y,end="")
	print()
	sp = sp-1