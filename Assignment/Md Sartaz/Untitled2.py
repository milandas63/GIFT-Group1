
def print_in_frame(word_list):
    max_length = max(len(word) for word in word_list)
    horizontal_border = "+" + "-" * (max_length + 2) + "+"

    print(horizontal_border)
    for word in word_list:
        spaces = " " * (max_length - len(word))
        print(f"| {word}{spaces} |")
    print(horizontal_border)

# Example usage:
word_list = ["Hello", "World", "in", "a", "frame"]
print_in_frame(word_list)