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


def confirmation(input):
    if input == "Y" or input == "y" or input == "Yes" or input == "yes":
        return True
    else:
        return False


def operation(input):
    if input == "Y" or input == "y" or input == "Yes" or input == "yes" or input == "N" or input == "n" or input == "No" or input == "no":
        return True
    else:
        return False


totalSub = int(input("How many subjects are there (without major/optional): "))

# Message
invalidOperation = "Error! Invalid operation"

#  Combind subject
combindSubjects = 0
comb_conf = input("\nIs there any combind subject(s) (Y=yes & N=no)    : ")
if operation(comb_conf) == False:
    print(invalidOperation)
else:
    if confirmation(comb_conf) == True:
        combindSubjects = int(input("How many combind subject(s): "))

    # Half marks subject
    halfSubjects = 0
    halfSub_conf = input("\nIs there any half-marks subject(s) (Y=yes & N=no) : ")
    if operation(halfSub_conf) == False:
        print(invalidOperation)
    else:
        if confirmation(halfSub_conf) == True:
            halfSubjects = int(input("How many half-marks subject(s): "))

        # Optional Subject
        opt_marks = 0
        opt_conf = input("\nIs there any major/optional subject (Y=yes & N=no): ")
        if operation(opt_conf) == False:
            print(invalidOperation)
        else:
            if combindSubjects > totalSub or halfSubjects > totalSub:
                print("Error!!! Combind or Half-marks Subject(s) are can't be more than total subjects")
            else:
                print("-------------------------\n")
                subjects = [None] * totalSub
                gpa_s = 0
                passed = True

                sub = 0
                for i in range(0, len(subjects)):
                    if combindSubjects > 0 and combindSubjects > i:
                        sub += 1
                        subjects[i] = int(input(str(i+1) + " => Enter the obtained marks of combind subject-" + str(sub) + ": "))
                    elif halfSubjects > 0 and halfSubjects >= len(subjects)-i:
                        if (halfSubjects == len(subjects) - i):
                            sub = 0
                        sub += 1
                        subjects[i] = int(input(str(i+1) + " => Enter the obtained marks of half-marks subject-" + str(sub) + ": "))
                    else:
                        subjects[i] = int(input(str(i+1) + " => Enter the obtained marks of subject SL-" + str(i+1) + ": "))


                if confirmation(opt_conf):
                    opt_marks = int(input(str(len(subjects)+1) + " => Enter the obtained marks of optional subject: "))


                for i in range(0, len(subjects)):
                    marks = 0.00
                    if combindSubjects > 0 and combindSubjects > i:
                        marks = subjects[i]/2
                    elif halfSubjects > 0 and halfSubjects >= len(subjects)-i:
                        marks = subjects[i]*2
                    else:
                        marks = subjects[i]
                    

                    if(gpa(marks) == 0):
                        passed = False
                        break
                    
                    gpa_s += gpa(marks);
                

                if passed == True:
                    totalGPA = gpa_s
                    gpa_s = gpa_s / len(subjects)
                    print("\nResult Passed \nGPA:", round(gpa_s, 2))
                    if confirmation(opt_conf) == True and opt_marks > 0:
                        opt_points = gpa(opt_marks)-2
                        if (opt_points < 0):
                            opt_points = 0
                        totalGPA = (totalGPA + opt_points) / len(subjects)
                        totalGPA = 5.00 if totalGPA > 5 else totalGPA
                        print("GPA (with optional):", round(totalGPA, 2)) 
                else:
                    print("\nResult Failed \nPoints: 0.00")