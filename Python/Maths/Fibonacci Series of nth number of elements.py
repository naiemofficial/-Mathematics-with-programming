num = int(input("Enter the number of elements: "))
term1 = 0; term2 = 1
nextTerm = term1 + term2
if num <= 0:
    print("Error! Entered number must be a positive number.")
else:
    print("\nFibonacci series of", num, "element(s):")
    for i in range(1, num+1):
        nextTerm = term1 + term2
        term1 = term2
        term2 = nextTerm
        print(term1, end=", ")