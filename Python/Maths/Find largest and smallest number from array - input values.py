size = int(input("How many number should have the array: "))
array = [None] * size
largest = smallest = 0
for i in range(0, len(array)):
    array[i] = int(input("Enter the number-"+str(i+1)+": "))
    if i == 0:
        largest = smallest = array[i]
    else:
        if array[i] > largest:
            largest = array[i]

        if array[i] < smallest:
            smallest = array[i]

print("\nYour array is:", array)
print("Largest number is:", largest)
print("Smallest number is:", smallest)