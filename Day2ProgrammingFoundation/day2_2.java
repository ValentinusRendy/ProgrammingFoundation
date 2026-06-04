import java.util.InputMismatchException;
import java.util.Scanner;

public class day2_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String stops = "t,T,no,stop";

        while (true){
            final int MIN_AGE = 21;
            final double MIN_SALARY_BOT = 3000000;
            final double MIN_SALARY_TOP = 8000000;


            try{
                System.out.println("Masukkan nama customer: ");
                String name = sc.nextLine();
                if (!name.matches("[a-zA-z ]+")){
                    throw new Exception("Masukkan nama yang valid");
                }
                System.out.println("Masukkan usia customer: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Masukkan penghasilan customer: ");
                double salary = Double.parseDouble(sc.nextLine());


                if (age < MIN_AGE){
                    System.out.println(name + " Tidak eligible");
                } else if(salary >= MIN_SALARY_BOT && salary <= MIN_SALARY_TOP) {
                    System.out.println(name + " Manual review");
                }else if (salary < MIN_SALARY_BOT){
                    System.out.println(name + " Tidak eligible");
                } else if (age >= MIN_AGE && salary >= MIN_SALARY_BOT){
                    System.out.println(name + " Eligible");
                } else{
                    System.out.println(name + " Tidak eligible");
                }

                System.out.println("Apakah mau lanjut (y/t?)");
                String answer = sc.nextLine();

                sc.close();


                if (stops.contains(answer.toLowerCase())){
                    System.out.println("Program berhenti");
                    break;
                }

                } catch (NumberFormatException e){
                System.out.println("Masukkan input angka yang valid");
            } catch (Exception e){
                System.out.println("Masukkan input yang valid : "+ e.getMessage());
            }
        }
    }
}