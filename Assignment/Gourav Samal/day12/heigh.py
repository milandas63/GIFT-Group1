H=int(input("Height of the pyramid : "))
for i in range(0,H):
    print((str("*")*((2*i)+1)).rjust(H+i," "))
