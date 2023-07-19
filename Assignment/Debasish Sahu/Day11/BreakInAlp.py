

digs=['ZERO','ONE','TWO','THREE','FOUR','FIVE','SIX','SEVEN','EIGHT','NINE']

num=str(int(input("NUMBER : ")))

for i in range(0,len(num)):
    print(digs[int(num[i])],end=' ')
print()
