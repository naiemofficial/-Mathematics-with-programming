num = int(input("Enter a positive number: "))
flag = True
if num <= 1:
    flag = False
else:
    i = 2
    for i in range(i, num):
        if(num % i == 0):
            flag = False
            break
            i += i

if flag == True:
    print(num, "is a prime number")
else:
    print(num, "isn't a prime number")