array = [ 6, 2, 8, 1, 5 ]
largest = array[0]
for i in range(0, len(array)):
    if array[i] > largest:
        largest = array[i]

print("Largest number is:", largest)