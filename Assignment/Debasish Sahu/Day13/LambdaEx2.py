P=int(input("PRINCIPAL AMOUNT : "))
def SI(Y):
    if(Y<=3):
        return lambda P:(P*Y*6.0)/100
    elif(Y<=5):
        return lambda P:(P*Y*5.5)/100
    elif(Y<=8):
        return lambda P:(P*Y*3.5)/100

Time=int(input("TIME : "))
print("\nSIMPLE INTEREST : ",(SI(Time))(P))
