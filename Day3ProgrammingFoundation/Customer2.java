class Customer{
    String name;
    int age;
    double salary;
    double existingLoan;

    Customer (String name, int age, double salary, double existingLoan){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.existingLoan = existingLoan;
    }

    double DBR(){
        double dbrPercentage = (this.existingLoan/this.salary)*100;
        return dbrPercentage;
    }

    void showCustomer(){
        System.out.println("Customer: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        System.out.println("Existing Loan: " + this.salary);
        System.out.printf("DBR Percentage: %.2f%%\n", DBR());


    }
}

class RiskAssesor{
    String assess(Customer customer){
        String status;
        
        if (customer.age < 21) {
            status = "Not Eligible";
        } else if (customer.salary >= 8000000){
            status = "Eligible";
        } else if (customer.salary >= 3000000){
            status = "Manual Review";
        } else{
            status = "Not Eligible";
        }

        return status;
    }
}


public class Customer2{
    public static void main (String[] args){
        Customer customer1 = new Customer("Rina", 24, 4_000_000, 2_030_000);
        customer1.showCustomer();

        RiskAssesor customerAssesor = new RiskAssesor();
        String result = customerAssesor.assess(customer1);
        System.out.printf("Result: %s\n", result);
    }
}