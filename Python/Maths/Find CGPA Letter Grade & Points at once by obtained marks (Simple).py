marks = int(input("Enter the obtained marks out of 100: "))
if marks >= 80:
    grade = "A+"; points = 4.00
elif marks >= 75:
    grade = "A"; points = 3.75
elif marks >= 70:
    grade = "A-";  points = 3.50
elif marks >= 65:
    grade = "B+"; points = 3.25
elif marks >= 60:
    grade = "B"; points = 3.00
elif marks >= 55:
    grade = "B-"; points = 2.75
elif marks >= 50:
    grade = "C+"; points = 2.50
elif marks >= 45:
    grade = "C"; points = 2.25
elif marks >= 40:
    grade = "D"; points = 2.00
else:
    grade = "F"; points = 0.00

print("\nGrade:", grade, "\nPoints:", round(points, 2))
