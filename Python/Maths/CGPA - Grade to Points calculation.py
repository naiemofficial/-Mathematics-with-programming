grade = input("Enter the obtained grade: ")
if grade == "A+":
    points = 4.00
elif grade == "A":
    points = 3.75
elif grade == "A-":
    points = 3.50
elif grade == "B+":
    points = 3.25
elif grade == "B":
    points = 3.00
elif grade == "B-":
    points = 2.75
elif grade == "C+":
    points = 2.50
elif grade == "C":
    points = 2.25
elif grade == "D":
    points = 2.00
elif grade == "F":
    points = 0.00
else:
    points = -1


if points == -1:
    print("\nInvalid grade")
elif points == 0.00:
    print("\nResult Failed\nPoints:", points)
else:
    print("\nResult Passed\nPoints:", points)