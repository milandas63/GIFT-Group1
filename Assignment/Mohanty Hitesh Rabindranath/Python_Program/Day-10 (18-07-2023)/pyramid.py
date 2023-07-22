h=int(input("ENTER THE HEIGHT OF PYRAMID : "))
for x in range(0,h):
    for y in range(x,h):
        print(" ",end='')
    for z in range(0,((2*x)-1)):
        print('*',end='')
    print("\n")
