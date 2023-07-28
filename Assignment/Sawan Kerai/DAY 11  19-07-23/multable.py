def padL(n,l):
    return rValue

start = 2
end = 11
for i in range(2, 10+1, 5):
    for j in range(1, 11):
        for k in range(i, i+5):
            if k>end:
                break
            print(padL(k,2),"x",padL(j,2),"=",padL((k*j),3)," ",end=' ')
        print()
    print()
