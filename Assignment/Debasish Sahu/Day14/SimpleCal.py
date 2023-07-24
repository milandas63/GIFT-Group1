import os
def INS():
    print()
    print("--------------------------")
    print("CALCULATOR INSTRUCTIONS : ")
    print("--------------------------")
    print()
    print("1)ADDITION.")
    print("2)SUBSTRACTION.")
    print("3)MULTIPLICATION.")
    print("4)DIVISION.")
    print("5)EXIT.")
    print();print("YOUR CHOICE : ",end="")
    V=int(input())
    return V

def Addition():
    N1=float(input("1ST NUMBER : "))
    N2=float(input("2ND NUMBER : "))
    print("\nADDITION OF ",N1," AND ",N2," IS ",float(N1+N2))

def Substraction():
    N1=float(input("1ST NUMBER : "))
    N2=float(input("2ND NUMBER : "))
    print("\nSUBSTRACTION OF ",N1," AND ",N2," IS ",float(N1-N2))

def Multiplication():
    N1=float(input("1ST NUMBER : "))
    N2=float(input("2ND NUMBER : "))
    print("\nMULTIPLICATION OF ",N1," AND ",N2," IS ",float(N1*N2))

def Division():
    N1=float(input("1ST NUMBER : "))
    N2=float(input("2ND NUMBER : "))
    print("\nDIVISION OF ",N1," AND ",N2," IS ",float(N1/N2))

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
        exit(0)

Calculator()