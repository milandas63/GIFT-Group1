
text = "God is Good"
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
