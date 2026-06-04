package ModelJava;

import java.util.ArrayList;
import java.util.List;
import ModelJava.Customer;

public class RiskAssesor {

    public List<String[]> assessCustomers(List<Customer> customersData){
        
        String status;
        final int MIN_AGE = 21;
        final double MIN_SALARY_BOT = 3000000;
        final double MIN_SALARY_TOP = 8000000;

        List<String[]> results = new ArrayList<>();

        for(Customer customer : customersData){
            String name = customer.name;
            int age = customer.age;
            double salary = customer.salary;

            if (age < MIN_AGE){
                status = "Tidak eligible";
            } else if(salary >= MIN_SALARY_BOT && salary <= MIN_SALARY_TOP) {
                status = "Manual review";
            } else if (salary < MIN_SALARY_BOT){
                status = "Tidak eligible";
            } else {
                status = "Eligible";
            }

            results.add(new String[]{name, status});
        }

        return results;
    }
}