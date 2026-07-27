# Function to check palindrome number
def is_palindrome(num):
    original = num
    reverse = 0

    while num > 0:
        digit = num % 10
        reverse = reverse * 10 + digit
        num = num // 10

    return original == reverse

# Input from user
num = int(input("Enter a number: "))

# Check and display result
if is_palindrome(num):
    print(num, "is a Palindrome number.")
else:
    print(num, "is not a Palindrome number.")
