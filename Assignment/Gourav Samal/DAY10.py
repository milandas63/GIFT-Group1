// PRINT A STRING IN A SQUARE OF STARS//


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

//TAKE A HEIGHT FROM THE USER AND PRINT THE PYRAMID OF THE STARS//


H=int(input("Height of the pyramid : "))
for i in range(0,H):
    print((str("*")*((2*i)+1)).rjust(H+i," "))




