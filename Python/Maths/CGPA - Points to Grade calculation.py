points = float(input("Enter the obtained points out of 4.00: "))
grade=""
if points > 4.00:
    grade = "invalid"
elif points == 4.00 :
    grade = "A+"
elif points >= 3.75:
    grade = "A"
elif points >= 3.50:
    grade = "A-"
elif points >= 3.25:
    grade = "B+"
elif points >= 3.00:
    grade = "B"
elif points >= 2.75:
    grade = "B-"
elif points >= 2.50:
    grade = "C+"
elif points >= 2.25:
    grade = "C"
elif points >= 2.00:
    grade = "D"
else:
    grade = "F"


if grade == "invalid":
    print("\nInvalid points;")
elif grade == "F":
    print("\nResult Failed\nGrade:", grade)
else:
    print("\nResult Passed\nGrade:", grade)