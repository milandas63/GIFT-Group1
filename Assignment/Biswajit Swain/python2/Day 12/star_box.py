""" 
Write a function that takes a list of strings and prints them, one per line, in a rectangular frame.
    For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:
        *********
        * Hello *
        * World *
        * in    *
        * a     *
        * frame *
        *********
"""
         
text = ['Hello','World','in','a','Frame']
#txt='\n'.join(text)
longest=0
for i in range(0,len(text)):
    if(len(text[i])>longest):
        longest=len(text[i])

total=longest+4
print('*'*(total))
for i in range(0,len(text)):
    print('*',text[i],' '*(longest-len(text[i])),end='*\n')
print('*'*(total))