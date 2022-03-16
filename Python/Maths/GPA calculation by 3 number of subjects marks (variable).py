def gpa(marks):
    if marks >= 80:
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
    return points


subject1 = int(input("Enter the obtained marks of subject-1: "))
subject2 = int(input("Enter the obtained marks of subject-2: "))
subject3 = int(input("Enter the obtained marks of subject-3: "))

if gpa(subject1) == 0 or gpa(subject2) == 0 or gpa(subject3) == 0:
    print("\nResult Failed \nPoints: 0.00")
else:
    avg_points = (gpa(subject1)+gpa(subject2)+gpa(subject3)) / 3
    print("\nResult Passed \nPoints:", round(avg_points, 2))