applicants = [
    "Rina",
    "Budi",
    "Andi",
    "Sari"
]

existing_loans = [
    "Budi",
    "Sari"
]


# O(n^2)
for customer in applicants:
    if customer in existing_loans:
        print(customer, "(punya existing loan) --> Manual Review")
    else:
        print(customer, "(tidak punya existing loan) --> Normal")


# O(n)
existing_loans = set(existing_loans)
for customer in applicants:
    if customer in existing_loans:
        print(customer, "(punya existing loan) --> Manual Review")
    else:
        print(customer, "(tidak punya existing loan) --> Normal")