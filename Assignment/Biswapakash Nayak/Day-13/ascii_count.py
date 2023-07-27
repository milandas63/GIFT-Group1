text = 'GIFT'
l = list(text)
length = len(l)
sum = 0
for i in range(0,length):
    c = text[i]
    asc = ord(c)
    sum = sum + asc
print(sum)
