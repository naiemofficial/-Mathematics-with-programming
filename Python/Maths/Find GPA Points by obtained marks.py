marks = int(input("Enter the obtained marks out of 100: "))
if marks > 100:
    points = -1
elif marks >= 80:
    points = 5.00
elif marks >= 70:
    points = 4.00
elif marks >= 60:
    points = 3.50
elif marks >= 50:
    points = 3.00
elif marks >= 40:
    points = 2.00
elif marks >= 33:
    points = 1.00
else:
    points = 0.00


if points == -1:
    print("\nInvalid marks. Result not found.")
elif points == 0.00:
    print("\nResult Failed \nPoints:", round(points, 2))
else:
    print("\nResult Passed \nPoints:", round(points, 2))