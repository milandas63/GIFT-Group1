// REVERSE A STRING//

text = 'GOURAV SAMAL'
rev = ''
for i in range(len(text)-1,-1,-1):
	rev = rev + text[i]
print(rev,end='')
