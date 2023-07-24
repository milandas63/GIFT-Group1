
def SimpleInterestRate(time):
    if time<=3:
        interest_amount_func = lambda principal : (principal * 6.0 * time) / 100
    elif time<=5:
        interest_amount_func = lambda principal : (principal * 5.5 * time) / 100
    elif time<=8:
        interest_amount_func = lambda principal : (principal * 3.5 * time) / 100
    return interest_amount_func;
      
      
sir = SimpleInterestRate(4)
print(sir(4000))
print(sir(3000))
print(sir(8500))
