CapLC=[0]*26
LowLC=[0]*26
St=input("ENTER THE STRING : ")
for x in range(0,len(St)):
    if(St[x]>='a' and St[x]<='z'):
        LowLC[(ord(St[x])-97)]+=1
    elif(St[x]>='A' and St[x]<='Z'):
        CapLC[(ord(St[x])-65)]+=1

for i in range(0,26):
    print(chr(65+i),' = ',CapLC[i],"   ",chr(97+i),' = ',LowLC[i])
