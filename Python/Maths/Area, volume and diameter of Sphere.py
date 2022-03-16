import math
radius = float(input("Enter the radius of sphere: "))
area = 4 * math.pi * math.pow(radius, 2) # or, area = 4 * 3.1416 * radius * radius
volume = (4/3) * math.pi * math.pow(radius, 3) # or, volume = (4/3) * 3.1416 * radius * radius * radius
diameter = 2 * radius

print("\nThe area of sphere is = ", round(area, 2))
print("The volume of sphere is = ", round(area, 2))
print("The diameter of sphere is = ", round(area, 2))
