#-----------AGE CALCULATOR------------ 

  
  
from datetime import date

print("----------Age Calculator----------")
birth_year = int(input("Enter the birth year: "))
birth_month = int(input("Enter the birth month: "))
birth_day = int(input("Enter the birth day: "))

current_date = date.today()
age = current_date.year - birth_year - ((current_date.month,        current_date.day) < (birth_month, birth_day))

print("Age:", age)



  
"""
  OUTPUT:
          Age Calculator
          Enter the birth year: 2004
          Enter the birth month: 03
          Enter the birth day: 03
          Age: 19
"""