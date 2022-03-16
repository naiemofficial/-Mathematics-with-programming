size = int(input("How many number should have the array: "))
array = [None] * size
smallest = 0
for i in range(0, len(array)):
    array[i] = int(input("Enter the number-"+str(i+1)+": "))
    if i == 0:
        smallest = array[i]
    elif array[i] > smallest:
        smallest = array[i]

print("\nSmallest number is:", smallest)