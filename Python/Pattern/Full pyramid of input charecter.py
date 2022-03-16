data = input("Enter a charecter: ")[0]
rows = int(input("Enter the number of rows: "))
for i in range(1, (rows+1)):
    space = rows
    for space in reversed(range(0, space-i)):
        print(" ", end='')

    for x in range(0, i):
        print(str(data) + " ", end='')

    print()