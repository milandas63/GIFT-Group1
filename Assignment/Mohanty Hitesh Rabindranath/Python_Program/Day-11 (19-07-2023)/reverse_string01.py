text = 'Mohanty Hitesh Rabindranath'
rev = ''
for i in range(len(text)-1,-1,-1):
	rev = rev + text[i]
print(rev,end='')
