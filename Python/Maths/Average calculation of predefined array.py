array = [15, 20, 30]
size = len(array)

sum = 0
for i in range(0, size):
    sum = sum + array[i]
    
sum = sum/size
print( "Average of numbers = ", round(sum, 2))