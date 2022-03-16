import math
a = int(input("Enter the value of a: "))
b = int(input("Enter the value of b: "))
c = int(input("Enter the value of c: "))

d = (b*b) - (4*a*c)
if a == 0:
    print("\nThis isn't Quadratic.")
else:
    if d == 0:
        x1 = -b / (2*a)
        print("\nRoots are real and same.")
        print("x1 = x2 =", x1)
    elif d > 0:
        x1 = (-b + math.sqrt(d)) / (2*a)
        x2 = (-b - math.sqrt(d)) / (2*a)
        print("\nRoots are real and not same")
        print("x1 =", x1)
        print("x2 =", x2)
    else:
        print("\nRoots are complex/imaginary")