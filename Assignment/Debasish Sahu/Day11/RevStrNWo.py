def RevIt(X):
    return X[::-1]

ST=input("GIVE A STRING : ")
Wos=ST.split(" ")
NST=""

for x in range(0,len(Wos)):
    NST=RevIt(Wos[x])+" "+NST

print("\n")
print("ORIGINAL STRING : ",ST)
print("REVERSED STRING WITH REVERSED WORD : ",NST)
