str = 'Gandhi Institute For Technology'
rev = ''
for i in range(len(str)-1,-1,-1):
	rev = rev + str[i]
print(rev,end='')