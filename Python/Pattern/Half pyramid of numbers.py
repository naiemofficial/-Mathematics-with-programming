rows = int(input("Enter the number of rows (1-9): "))
for i in range(1, (rows+1)):
    for x in range(0, i):
        print(str(x+1) + " ", end='')

    print()