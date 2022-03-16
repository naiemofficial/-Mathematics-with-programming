begin = int(input("Enter the beginning number: "))
max = int(input("Enter the max nth number: "))

print("\nPrime numbers are: ")
for num in range(begin, max+1):
    flag = True
    if num <= 1:
        flag = False
    else:
        for i in range(2, num):
            if num % i == 0:
                flag = False
                break
            
    if flag == True:
        print(num, end=", ")