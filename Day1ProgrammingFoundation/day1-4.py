age = 22
MIN_AGE = 21

if age >= MIN_AGE:
    print('Eligible by age')
else:
    print("not eligible by age")

# if one liner
print("Eligible by age") if age >= MIN_AGE else print("Not eligible by age")