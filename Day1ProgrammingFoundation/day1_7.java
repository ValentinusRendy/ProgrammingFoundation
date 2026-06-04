import java.util.Scanner;

public class day1_7{
    public static void main(String[] args) {

        final int MIN_AGE = 21;
        final double MIN_SALARY = 3000000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama customer: ");
        String name = sc.nextLine();

        System.out.println("Masukkan usia customer: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Masukkan penghasilan customer: ");
        double salary = Double.parseDouble(sc.nextLine());

        if (age < MIN_AGE){
            System.out.println(name + " tidak eligible secara usia");
        } else if (salary < MIN_SALARY){
            System.out.println(name + " tidak eligible secara penghasilan");
        } else if (age >= MIN_AGE && salary >= MIN_SALARY){
            System.out.println(name + " eligible");
        } else{
            System.out.println(name + " tidak eligible");
        }


    }
}