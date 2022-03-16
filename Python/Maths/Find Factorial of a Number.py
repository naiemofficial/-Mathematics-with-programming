num = int(input("Enter a positive number: "))
fact = 1
if num < 0:
    print("Sorry! Factorial of a negative number doesn't exist.");
else:
    for i in range(1, num+1):
        fact = fact * i

    print("Factorial of", num, "is =", fact )