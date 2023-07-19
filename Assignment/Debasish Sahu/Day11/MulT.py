def padL(num,l):
    PV=str(num)
    for i in range(len(PV),l):
        PV=' '+PV
    return PV

Ln=int(input("TILL HOW MUCH : "))
for i in range(2,Ln+1,5):
    for j in range(1,11):
        for k in range(i,i+5):
            if(k>Ln):
                continue
            else:
                print(padL(int(k),2),' x ',padL(int(j),2),' = ',padL(int(k*j),3),end=' ')
        print()
    print()
