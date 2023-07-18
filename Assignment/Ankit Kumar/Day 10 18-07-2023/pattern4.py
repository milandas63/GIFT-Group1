#  d)      *
#         * *
#        *   *
#       *     *
#      *       *
#     *         *
#    *           *
#   *             *
#  *               *
# *******************



sp = 35
st = 1
for x in range(1,11):
	for y in range(0,sp):
		print(" ",end="")
	for y in range(0,st):
		if (y>0 and y<st-1 and x<10):
			print(" ",end="")
		else:
			print("*",end="")
	print()
	sp=sp-1
	st=st+2