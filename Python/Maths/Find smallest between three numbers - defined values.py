num1 = 5; num2 = 6; num3 = 7
if num1 < num2 and num1 < num3:
    print("Smallest number is:",  num1)
elif num2 < num1 and num2 < num3:
    print("Smallest number is:",  num2)
elif num3 < num1 and num3 < num2:
    print("Smallest number is:",  num3)
else:
    print("Something wrong! Entered 2 smallest or more numbers are equal.")