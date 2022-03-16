import math
num = int(input("Enter a number: "))
temp = num
sum = 0
while (temp != 0):
    rem = temp % 10
    sum += math.pow(rem, 3)  # sum += rem * rem * rem
    temp = temp // 10

if(num == sum):
    print(num, "is an Armstrong number")
else:
    print(num, "isn't an Armstrong number")