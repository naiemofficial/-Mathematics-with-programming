num = int(input("Enter a positive number: "))
print("\nMultiplication table of:", num)
for i in range(1, 11):
    print(num, "x", i, "=", str(num*i))
