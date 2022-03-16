marks = int(input("Enter the obtained marks out of 100: "))
if marks > 100:
    grade = "invalid"
elif marks >= 80:
    grade = "A+"
elif marks >= 75:
    grade = "A"
elif marks >= 70:
    grade = "A-"
elif marks >= 65:
    grade = "B+"
elif marks >= 60:
    grade = "B"
elif marks >= 55:
    grade = "B-"
elif marks >= 50:
    grade = "C+"
elif marks >= 45:
    grade = "C"
elif marks >= 40:
    grade = "D"
else:
    grade = "F"
    
# Advance method used for more validation
if grade == "invalid":
    print("\nInvalid marks. Result not found.")
elif grade == 0.00:
    print("\nResult Failed \nGrade:", grade)
else:
    print("\nResult Passed \nGrade:", grade)