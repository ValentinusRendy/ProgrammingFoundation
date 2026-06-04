class Customer_model:
    def __init__(self, name, age, salary):
        self.name = name
        self.age = age
        self.salary = salary


class Risk_Assesor:
    def assess(customer):
        if customer.age < 21:
            return "Not Eligible"
        elif customer.salary >= 8000000:
            return "Eligible"
        elif customer.salary >= 3000000:
            return "Manual Review"
        else:
            return "Not Eligible"


