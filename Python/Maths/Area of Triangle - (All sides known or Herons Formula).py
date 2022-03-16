import math
a = float(input("Enter the value of a: "))
b = float(input("Enter the value of b: "))
c = float(input("Enter the value of c: "))

if (a+b) > c and (b+c) > a and (c+a) > b:
    s = (a+b+c)/2
    area = math.sqrt(s * (s-a) * (s-b) * (s-c))
    print("The area of triangle is =", round(area, 2))
else:
    print("Invalid Triangle")