def print_pyramid(rows):
    for i in range(1, rows + 1):
        # Generate the spaces for the current row
        spaces = " " * (rows - i)

        # Generate the stars for the current row
        stars = "*" * (2 * i - 1)

        # Concatenate the spaces and stars and right-align the result
        row_str = spaces + stars
        print(row_str.rjust(rows * 2 - 1))


# Example usage:
num_rows = 5
print_pyramid(num_rows)



print()
print("----------------------------------------Next-----------------------------------")


def print_pyramid(rows):
    for i in range(1, rows + 1):
        # Generate the spaces for the current row
        spaces = " " * (rows - i)

        # Generate the stars for the current row
        stars = "*" * (2 * i - 1)

        # Concatenate the spaces and stars and right-align the result
        row_str = spaces + stars
        print(row_str.rjust(rows * 2 - 1))
		# Concatente the spaces and stars and left-aling the result
		row_str = spaces + stars
		print(col_str. ljust(col * 2- i+1))



	# Example usage:
num_rows = 5
print_pyramid(num_rows)

print()
print("----------------------------------------------------Next----------------------------")



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

