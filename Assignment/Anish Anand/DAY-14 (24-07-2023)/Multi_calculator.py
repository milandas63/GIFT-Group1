from datetime import date as Dt

def INS():
    print()
    print("--------------------------")
    print("CALCULATOR INSTRUCTIONS : ")
    print("--------------------------")
    print()
    print("1) ADDITION.")
    print("2) SUBSTRACTION.")
    print("3) MULTIPLICATION.")
    print("4) DIVISION.")
    print("5) EXIT TO MAIN MENU.")
    print();print("YOUR CHOICE : ",end="")
    V=int(input())
    return V

def Addition():
    N1=float(input("1ST NUMBER : "))
    N2=float(input("2ND NUMBER : "))
    print("\nADDITION OF ",N1," AND ",N2," IS ",float(N1+N2))
    print("--------------------------")

def Substraction():
    N1=float(input("1ST NUMBER : "))
    N2=float(input("2ND NUMBER : "))
    print("\nSUBSTRACTION OF ",N1," AND ",N2," IS ",float(N1-N2))
    print("--------------------------")

def Multiplication():
    N1=float(input("1ST NUMBER : "))
    N2=float(input("2ND NUMBER : "))
    print("\nMULTIPLICATION OF ",N1," AND ",N2," IS ",float(N1*N2))
    print("--------------------------")

def Division():
    N1=float(input("1ST NUMBER : "))
    N2=float(input("2ND NUMBER : "))
    print("\nDIVISION OF ",N1," AND ",N2," IS ",float(N1/N2))
    print("--------------------------")

def Calculator():
    #os.system('cls')
    ch=INS()
    if(ch==1):
        Addition()
        Calculator()
    elif(ch==2):
        Substraction()
        Calculator()
    elif(ch==3):
        Multiplication()
        Calculator()
    elif(ch==4):
        Division()
        Calculator()
    elif(ch==5):
        StartProg()
    
def CINS():
    print()
    print("1) INR TO USD")
    print("2) INR TO EURO")
    print("3) USD TO INR")
    print("4) USD TO EURO")
    print("5) EURO TO INR")
    print("6) EURO TO USD")
    print("7) EXIT TO MAIN MENU.")
    print();print("YOUR CHOICE : ",end='')
    V=int(input())
    return V

def CurrencyConvert():
    ch=CINS()
    if(ch==1):
        INR=int(input("INR : "))
        print(INR," INR = ",float(INR*0.012)," USD")
        print("--------------------------")
        CurrencyConvert()
    elif(ch==2):
        INR=int(input("INR : "))
        print(INR," INR = ",float(INR*0.011)," EURO")
        print("--------------------------")
        CurrencyConvert()
    elif(ch==3):
        USD=float(input("USD : "))
        print(USD," USD = ",float(USD*81.80)," INR")
        print("--------------------------")
        CurrencyConvert()
    elif(ch==4):
        USD=float(input("USD : "))
        print(USD," USD = ",float(USD*0.90)," EURO")
        print("--------------------------")
        CurrencyConvert()
    elif(ch==5):
        EURO=float(input("EURO : "))
        print(EURO," EURO = ",float(EURO*90.56)," INR")
        print("--------------------------")
        CurrencyConvert()
    elif(ch==6):
        EURO=float(input("EURO : "))
        print(EURO," EURO = ",float(EURO*1.11)," USD")
        print("--------------------------")
        CurrencyConvert()
    elif(ch==7):
        StartProg()
    else:
        print("THERE IS NO SUCH SECTION DEFINED FOR THE OPTION ",ch," THANK YOU")
        print("--------------------------")
        CurrencyConvert()

def TEMPINS():
    print()
    print("1) IN FAHRENHEIT.")
    print("2) IN CELSIUS.")
    print("3) IN KELVIN.")
    print("4) EXIT TO MAIN MENU.")
    print("\nYOUR CHOICE : ",end="")
    V=int(input())
    return V

def AgeCalc():
    print("BIRTH INFO :->")
    D=int(input("DATE : "))
    M=int(input("MONTH : "))
    Y=int(input("YEAR : "))

    YY=Dt(Y,M,D)
    CY=Dt.today()
    Age=(CY.year)-(YY.year)-((CY.month,CY.day)<(YY.month,YY.day))
    print("YOUR AGE IS : ",Age)
    print("Entering to Main Menu")
    print("--------------------------")
    
def TempCalc():
    ch=TEMPINS()
    if(ch==1):
        Tmp=float(input("TEMPERATURE IN FAHRENHEIT : "))
        print()
        print("FAHRENHEIT : ",Tmp)
        print("CELSIUS    : ",float((((Tmp-32)*5)/9)))
        print("KELVIN     : ",float((((Tmp-32)*5)/9)+273.15))
        print("--------------------------")
        print()
    elif(ch==2):
        Tmp=float(input("TEMPERATURE IN CELSIUS : "))
        print()
        print("CELSIUS    : ",Tmp)
        print("FAHRENHEIT : ",float((((Tmp*9)/5)+32)))
        print("KELVIN     : ",float(Tmp+273.15))
        print("--------------------------")
        print()
    elif(ch==3):
        Tmp=float(input("TEMPERATURE IN KELVIN : "))
        print()
        print("KELVIN     : ",Tmp)
        print("CELSIUS    : ",float(((Tmp)-273.15)))
        print("FAHRENHEIT : ",float((((((Tmp)-273.15)*9)/5)+32)))
        print("--------------------------")
        print()
    elif(ch==4):
        StartProg()
    else:
        print("THERE IS NO SUCH CHOICE SUCH AS ",ch)
        TempCalc()
    
def Metric_ins():
    print("1.  Centimeter to Millimeter")
    print("2.  Decimeter to Centimeter")
    print("3.  Meter to Centimeter")
    print("4.  Kilometer to Meter")
    print("5.  Meter to Decimeter")
    print("6.  Foot to Inches")
    print("7.  Inch to Centimeter")
    print("8.  Yard to Feet")
    print("9.  Yard to Inches")
    print("10. Mile to Kilometers")
    print("11. Enter to Main Menu")
    print("\n YOUR CHOICE : ",end='')
    v=int(input())
    return v
    
def Metric_conv():
    ch = Metric_ins()
    if(ch==1):
        inp = float(input("Enter unit in Centimeter: "))
        print("\nMillimeter = ",float(inp*10))
        print("--------------------------")
    elif(ch==2):
        inp = float(input("Enter unit in Decimeter: "))
        print("\nCentimeter = ",float(inp*10))
        print("--------------------------")
    elif(ch==3):
        inp = float(input("Enter unit in Meter: "))
        print("\nCentimeter = ",float(inp*100))
        print("--------------------------")
    elif(ch==4):
        inp = float(input("Enter unit in Kilometer: "))
        print("\nMeter = ",float(inp*1000))
        print("--------------------------")
    elif(ch==5):
        inp = float(input("Enter unit in Meter: "))
        print("\nDecimeter = ",float(inp*10))
        print("--------------------------")
    elif(ch==6):
        inp = float(input("Enter unit in Foot: "))
        print("\nInches = ",float(inp*12))
        print("--------------------------")
    elif(ch==7):
        inp = float(input("Enter unit in Inch: "))
        print("\nCentimeter = ",float(inp*2.54))
        print("--------------------------")
    elif(ch==8):
        inp = float(input("Enter unit in Yard: "))
        print("\Feet = ",float(inp*3))
        print("--------------------------")
    elif(ch==9):
        inp = float(input("Enter unit in Yard: "))
        print("\Inches = ",float(inp*36))
        print("--------------------------")
    elif(ch==10):
        inp = float(input("Enter unit in Mile: "))
        print("\nKilometer = ",float(inp*1.61))
        print("--------------------------")
    elif(ch==11):
        StartProg()
    else:
        print("Invalid Choice : ",ch)
        print("--------------------------")
        print()
        Metric_conv()

def Weight_ins():
    print("1.  Kilogram to Gram")
    print("2.  Gram to Milligram")
    print("3.  Pound to Kilogram")
    print("4.  Metric Ton to Kilogram")
    print("5.  Enter to Main Menu")
    print("\nYOUR CHOICE : ",end='')
    v=int(input())
    return v

def Weight_conv():
    ch = Weight_ins()
    if(ch==1):
        inp = float(input("Enter unit in Kilogram: "))
        print("\nGrams = ",float(inp*1000))
        print("--------------------------")
    elif(ch==2):
        inp = float(input("Enter unit in Gram: "))
        print("\nMilligrams = ",float(inp*1000))
        print("--------------------------")
    elif(ch==3):
        inp = float(input("Enter unit in Pound: "))
        print("\nKilograms = ",float(inp*0.456))
        print("--------------------------")
    elif(ch==4):
        inp = float(input("Enter unit in Metric Ton: "))
        print("\nKilograms = ",float(inp*1000))
        print("--------------------------")
    elif(ch==5):
        StartProg()
    else:
        print("Invalid Choice : ",ch)
        print("--------------------------")
        print()
        Weight_conv()

def Volume_ins():
    print("1.  Cubic Centimeter to Cubic Millimeters")
    print("2.  Cubic Deicmeter to Cubic Centimeters")
    print("3.  Cubic Meter to Cubic Centimeters")
    print("4.  Cubic Meter to Cubic Decimeters")
    print("5.  Cubic Kilometer to Cubic Meters")
    print("6.  Enter to Main Menu")
    print("\nYOUR CHOICE : ",end='')
    v=int(input())
    return v
    
def Volume_conv():
    ch = Volume_ins()
    if(ch==1):
        inp = float(input("Enter unit in Cubic Centimeter: "))
        print("\nCubic Millimeters = ",float(inp*1000))
        print("--------------------------")
    elif(ch==2):
        inp = float(input("Enter unit in Cubic Decimeter: "))
        print("\nCubic Centimeters = ",float(inp*1000))
        print("--------------------------")
    elif(ch==3):
        inp = float(input("Enter unit in Cubic Meter: "))
        print("\nCubic Centimeters = ",float(inp*1000000))
        print("--------------------------")
    elif(ch==4):
        inp = float(input("Enter unit in Cubic Meter: "))
        print("\nCubic Decimeters = ",float(inp*1000))
        print("--------------------------")
    elif(ch==5):
        inp = float(input("Enter unit in Cubic Kilometer: "))
        print("\nCubic Meters = ",float(inp*1000000000))
        print("--------------------------")
    elif(ch==6):
        StartProg()
    else:
        print("Invalid Choice : ",ch)
        print("--------------------------")
        print()
        Volume_conv()

def MAININS():
    print("\n\n")
    print("     MAIN MENU\n")
    print("1) NORMAL CALCULATOR.")
    print("2) AGE CALCULATOR.")
    print("3) TEMPERATURE CONVERTER.")
    print("4) CURRENCY CONVERTER.")
    print("5) METRIC CONVERSION.")
    print("6) WEIGHT CONVERSION. ")
    print("7) VOLUME CONVERSION. ")
    print("8) EXIT")
    print()
    print("YOUR CHOICE : ",end="")
    CH=int(input())
    return CH

def StartProg():
    ch=MAININS()
    if(ch==1):
        Calculator()
    elif(ch==2):
        AgeCalc()
    elif(ch==3):
        TempCalc()
    elif(ch==4):
        CurrencyConvert()
    elif(ch==5):
        Metric_conv()
    elif(ch==6):
        Weight_conv()
    elif(ch==7):
        Volume_conv()
    elif(ch==8):
        print("Exited Successfully !")
        exit(0)
    else:
        print("THERE IS NO TASK ON OPTION ",ch," TRY AGAIN ")
    StartProg()

StartProg()
