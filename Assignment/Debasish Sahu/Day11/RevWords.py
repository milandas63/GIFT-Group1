St=input("Give the String : ")
Words= St.split(" ")
NSt=""
for x in range(0,len(Words)):
    NSt=Words[x]+" "+NSt

print(NSt)
