H=int(input("Term length : "))
count=1
n=1
while count<=H:
    print(int(n),end=', ')
    count+=1
    if(count%2==0):
        n=(2*n)+1
    else:
        n=(2*n)-1

print("")  
