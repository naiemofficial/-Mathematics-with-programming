marks = int(input("Enter the obtained marks out of 100: "))
if marks > 100:
    grade = "invalid"; points = -1
elif marks >= 80:
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

# Advance method used for more validation
if points == -1:
    print("\nInvalid marks. Result not found.")
elif points == 0.00:
    print("\nResult Failed \nGrade:", grade, "\nPoints:", points)
else:
    print("\nResult Passed \nGrade:", grade, "\nPoints:", points)