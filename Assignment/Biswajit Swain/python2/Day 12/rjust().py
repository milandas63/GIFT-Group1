#  write the pyramid program using rjust() function? 

h=int(input("Height of the pyramid : "))
for i in range(0,h):
    print((str("*")*((2*i)+1)).rjust(h+i," "))