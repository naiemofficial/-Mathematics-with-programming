marks = int(input("Enter the obtained marks out of 100: "))
if marks >= 80:
    grade = "A+"; points = 5.00
elif marks >= 70:
    grade = "A"; points = 4.00
elif marks >= 60:
    grade = "A-"; points = 3.50
elif marks >= 50:
    grade = "B"; points = 3.00
elif marks >= 40:
    grade = "C"; points = 2.00
elif marks >= 33:
    grade = "D"; points = 1.00
else:
    grade = "F"; points = 0.00

print("\nGrade:", grade, "\nPoints: ", round(points, 2))
