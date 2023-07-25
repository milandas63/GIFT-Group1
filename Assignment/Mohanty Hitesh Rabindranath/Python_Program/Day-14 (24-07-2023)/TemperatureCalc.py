#  ----------TEMPERATURE CDALCULATOR----------

def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32
def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9
print("----------Temperature Calculator----------")
temp = float(input("Enter the temperature: "))
unit = input("Enter the unit (C, F): ")

if unit.upper() == "C":
    fahrenheit = celsius_to_fahrenheit(temp)
    print("Fahrenheit:", fahrenheit)
elif unit.upper() == "F":
    celsius = fahrenheit_to_celsius(temp)
    print("Celsius:", celsius)
else:
    print("Invalid unit")
    exit()


"""
  OUTPUT:
          ----------Temperature Calculator----------
          Enter the temperature:258
          Enter the unit (C, F): c
          Fahrenheit: 136.4
  OUTPUT:
          ----------Temperature Calculator----------
          Enter the temperature: 125486
          Enter the unit (C, F): F
          Celsius: 69696.66666666667
"""
