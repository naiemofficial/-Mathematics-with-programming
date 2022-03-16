size = int(input("Enter the size of array: "))
print("-------------------------\n")
array = [None] * size

sum = 0
for i in range(0, len(array)):
    array[i] = int(input("Enter the value of number-"+str((i+1))+": "))
    sum = sum + array[i]

sum = sum/len(array)
print("\nYour array is:", array)
print("Average of numbers = ", round(sum, 2))