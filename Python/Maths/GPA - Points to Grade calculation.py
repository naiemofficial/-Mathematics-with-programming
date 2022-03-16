points = float(input("Enter the obtained points out of 5.00: "))
if points > 5.00:
    grade = "invalid"
elif points == 5.00:
    grade = "A+"
elif points >= 4.00:
    grade = "A"
elif points >= 3.50:
    grade = "A-"
elif points >= 3.00:
    grade = "B"
elif points >= 2.00:
    grade = "C"
elif points >= 1.00:
    grade = "D"
else:
    grade = "F"


if grade == "invalid":
    print("Invalid points")
elif grade == "F":
    print("\nResult Failed \nGrade:", grade)
else:
    print("\nResult Passed \nGrade:", grade)