#          1        
#         121       
#        12321      
#       1234321     
#      123454321    
#     12345654321   
#    1234567654321  
#   123456787654321 
#  12345678987654321
for x in range(0,10):
	for y in range(1,sp+1):
		print(" ",end="")
	for y in range(1,x+1):
		print(y,end="")
	for y in range(x-1, 0, -1):
		print(y,end="")
	print()
	sp = sp-1
