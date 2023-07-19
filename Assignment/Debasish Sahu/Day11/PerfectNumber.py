start=int(input("STARTING POINT : "))
End=int(input("ENDING POINT : "))

for x in range(start,End+1):
    sum=0
    for y in range(1,x):
        if(x%y==0):
            sum+=y
    if(sum==x):
        print(int(x),end=', ')

