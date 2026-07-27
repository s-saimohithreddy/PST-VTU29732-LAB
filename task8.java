# Function to find the nth Fibonacci number
def fibonacci(n):
    if n <= 0:
        return "Enter a positive integer"
    elif n == 1:
        return 0
    elif n == 2:
        return 1

    a = 0
    b = 1

    for i in range(3, n + 1):
        c = a + b
        a = b
        b = c

    return b

# Input from user
n = int(input("Enter the value of n: "))

# Output
print("The", n, "th Fibonacci number is:", fibonacci(n))
