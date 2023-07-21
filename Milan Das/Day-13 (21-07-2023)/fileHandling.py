"""
	Read the content of a text file in the name gift.txt and write it on the
	monitor/console/screen.

	For the above work, file handling will be required:
	The file handling has 4 functions:
		1. Open
		2. Read
		3. Write
		4. Close

	CLASSWORK:
	Write a program to read the content and print. The output will appear with one space
	after each character.
		Example:
			Hello World!
			H e l l o   W o r l d !

"""
with open('gift.txt', 'r') as fileHandle:
	content = fileHandle.read()
	print(content, end='')
	fileHandle.close()
