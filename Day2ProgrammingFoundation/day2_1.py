try:
    age = int(input("Enter age: "))
    print("Next year:", age + 1)
except ValueError:
    print("Please enter a valid number.")