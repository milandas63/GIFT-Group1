
def Year(n):
    return lambda age : n*age

Y=int(input("HOW LONG YOU HAVE LIVED : "))
TotalWaste=Year(365)
print("Bro you have wasted ",TotalWaste(Y)," Days successfuly")
