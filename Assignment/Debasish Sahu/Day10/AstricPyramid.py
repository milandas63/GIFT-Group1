H=int(input("HEIGHT : "))
for x in range(0,H):
    for z in range(x,H):
        print(" ",end='')
    for y in range(0,((2*x)-1)):
        print('*',end='')
    print("\n")