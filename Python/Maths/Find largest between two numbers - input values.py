num1 = int(input("Enter the 1st number: "))
num2 = int(input("Enter the 2nd number: "))

if num1 > num2:
    print("Largest number is:",  num1)
elif num2 > num1:
    print("Largest number is:",  num2)
else:
    print("Largest number not found. Entered numbers are equal.")