str = 'Gandhi Institute For Technology'
x = str.split()
for i in range(0,len(x)):
    for j in range(len(x[i])-1,-1,-1):
        print(x[i][j],end='')
    print(' ',end='')

