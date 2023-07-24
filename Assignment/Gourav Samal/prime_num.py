// TO PRINT ALL THE PRIME NUMBERS FROM 1000 TO 40000//

flag=True
for i in range(1000,4000):
    for j in range (2,i):
        if i%j==0:
            flag=False
            break
    if (flag==True):
        print(i)
    flag=True
