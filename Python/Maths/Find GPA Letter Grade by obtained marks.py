marks = int(input("Enter the obtained marks out of 100: "))
if marks > 100:
    grade = "invalid"
elif marks >= 80:
    grade = "A+"
elif marks >= 70:
    grade = "A"
elif marks >= 60:
    grade = "A-"
elif marks >= 50:
    grade = "B"
elif marks >= 40:
    grade = "C"
elif marks >= 33:
    grade = "D"
else:
    grade = "F"


if grade == "invalid":
    print("\nInvalid marks. Result not found.")
elif grade == "F":
    print("\nResult Failed \nGrade:", grade)
else:
    print("\nResult Passed \nGrade:", grade)