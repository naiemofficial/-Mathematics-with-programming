size = int(input("How many number should have the array: "))
array = [None] * size
largest = 0
for i in range(0, len(array)):
    array[i] = int(input("Enter the number-"+str(i+1)+": "))
    if i == 0:
        largest = array[i]
    elif array[i] > largest:
        largest = array[i]

print("\nLargest number is:", largest)