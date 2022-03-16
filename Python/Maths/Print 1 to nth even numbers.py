num = int(input("Enter a number: "))
print("Even numbers are", end=": ")
for i in range(1, num+1):
    if i%2 == 0:
        print(i, end=", ")