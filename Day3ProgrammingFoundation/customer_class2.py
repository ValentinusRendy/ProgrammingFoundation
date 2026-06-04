class Customer:
    def __init__(self, name, age, salary, existing_loan):
        self.name = name
        self.age = age
        self.salary = salary
        self.existing_loan = existing_loan
    
    def DBR(self):
        DBR_percentage = (self.existing_loan/self.salary)*100
        return DBR_percentage

    def show_summary(self):
        print("Customer:", self.name)
        print("Age:", self.age)
        print("Age:", self.salary)
        print("Existing loan:", self.existing_loan)
        print(f"DBR Percentage:{self.DBR():.2f}%")

class Risk_Assesor:
    def assess(self, customer):
        if customer.age < 21:
            return "Not Eligible"
        elif customer.salary >= 8000000:
            return "Eligible"
        elif customer.salary >= 3000000:
            return "Manual Review"
        else:
            return "Not Eligible"


Customer1= Customer("Rina", 24, 8500000, 2000000)
Customer1.show_summary()

assesor = Risk_Assesor()
print(assesor.assess(Customer1))

