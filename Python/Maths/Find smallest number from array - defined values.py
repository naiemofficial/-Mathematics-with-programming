array = [6, 2, 8, 1, 5]
smallest = array[0]
for i in range(0, len(array)):
    if array[i] < smallest:
        smallest = array[i]

print("\nSmallest number is:", smallest)