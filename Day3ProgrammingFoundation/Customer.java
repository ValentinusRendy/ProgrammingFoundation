import java.util.jar.Manifest;

public class Customer{
    String name;
    int age;
    double salary;

    public Customer (String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    

    public static void main (String[] args){
        Customer customer1 = new Customer("Rina", 24, 4_000_000);
        System.out.println(customer1.name);
        System.out.println(customer1.age);
        System.out.println(customer1.salary);
    }
}