num = int(input("Enter a positive number: "))
term1 = 0; term2 = 1
nextTerm = term1 + term2
if num <= 0:
    print("Error! Entered number must be a positive number.")
else:
    print("\nFibonacci series to", str(num)+"th term(s):")
    while (nextTerm <= num):
        nextTerm = term1 + term2
        term1 = term2
        term2 = nextTerm
        print(term1, end=", ")