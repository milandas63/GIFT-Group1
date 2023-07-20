St=input("Enter the STRING : ")
Words=St.split(" ")
longest=0
for i in range(0,len(Words)):
    if(len(Words[i])>longest):
        longest=len(Words[i])

FullF=longest+4
print('*'*(FullF))
for x in range(0,len(Words)):

    print('*',Words[x],' '*(longest-len(Words[x])),end='*\n')
    

print('*'*(FullF))
