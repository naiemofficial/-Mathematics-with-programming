# Python ≥3.10 is required to run this program
grade = input("Enter the obtained grade: ")
match grade:
    case "A+":
        points = 4.00
    case "A":
        points = 3.75
    case "A-":
        points = 3.50
    case "B+":
        points = 3.25
    case "B":
        points = 3.00
    case "B-":
        points = 2.75
    case "C+":
        points = 2.50
    case "C":
        points = 2.25
    case "D":
        points = 2.00
    case "F":
        points = 0.00
    case _:
        points = -1


if points == -1:
    print("Invalid grade")
elif points == 0.00:
    print("\nResult Failed \nPoints:", round(points, 2))
else:
    print("\nResult Passed \nPoints:", round(points, 2))