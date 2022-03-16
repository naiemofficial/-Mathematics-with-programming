array = [6, 2, 8, 1, 5]
largest = smallest = array[0]
for i in range(0, len(array)):
    if array[i] > largest:
        largest = array[i]

    if array[i] < smallest:
        smallest = array[i]

print("Your array is:", array)
print("Largest number is:", largest)
print("Smallest number is:", smallest)