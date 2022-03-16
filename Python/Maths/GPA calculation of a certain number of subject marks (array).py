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


totalSub = int(input("How many subjects are there: "))
print("-------------------------\n")

subjects = [None] * totalSub
gpa_s = 0
passed = True

for i in range(0, len(subjects)):
    subjects[i] = int(input("Enter the obtained marks of subject-"+str(i+1)+": "))
    gpa_s += gpa(subjects[i])

for i in range(0, len(subjects)):
    if (gpa(subjects[i]) == 0):
        passed = False

if passed == True:
    gpa_s = gpa_s / len(subjects)
    print("\nResult Passed \nPoints:", round(gpa_s, 2))
else:
    print("\nResult Failed \nPoints: 0.00")