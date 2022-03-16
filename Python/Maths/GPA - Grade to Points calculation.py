grade = input("Enter the obtained grade: ")
if grade == "A+":
    points = 5.00
elif grade == "A":
    points = 4.00
elif grade == "A-":
    points = 3.50
elif grade == "B":
    points = 3.00
elif grade == "C":
    points = 2.00
elif grade == "D":
    points = 1.00
elif grade == "F":
    points = 0.00
else:
    points = -1


if points == -1:
    print("Invalid grade")
elif points == 0.00:
    print("\nResult Failed \nPoints:", round(points, 2))
else:
    print("\nResult Passed \nPoints:", round(points, 2))