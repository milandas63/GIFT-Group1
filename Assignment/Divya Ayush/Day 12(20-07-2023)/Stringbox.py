def hello_world(words):
    size = max(len(word) for word in words)
    print("*"*(size+4))

    for i in words:
        print("*"+" "+i+" "*((size+4)-len(i)-3)+"*")

    print("*"*(size+4))

hello_world(["Hello","world","in","a","frame"])
