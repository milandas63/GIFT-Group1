h=H=int(input("HEIGHTs : "))
for x in range(0,H):
    for y in range(x,H):
        print(" ",end='')
    for z in range(0,((2*x)+1)):
        print('*',end='')
    print("")

#print("After upper part")
#
for a in range(h-1,0,-1):
    #print("in loop")
    for b in range(0,h-a+1):
        print(" ",end='')
    for c in range(0,((2*a)-1)):
        print("*",end='')
    print("")
#print("END OF LOOP")