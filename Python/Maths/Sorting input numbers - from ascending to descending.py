size = int(input("How many numbers are there: "))
numbers = [None] * size
for i in range(0, len(numbers)):
    numbers[i] = int(input("Enter the number-"+str(i+1)+": "))

temp = 0
for i in range(0, len(numbers)):
    for x in range(0, len(numbers)-1):
        if numbers[x] > numbers[(x+1)]:
            temp = numbers[x]
            numbers[x] = numbers[(x+1)]
            numbers[(x+1)] = temp

print("\nNumbers are sorted from ASC to DSC: ")
print(numbers)