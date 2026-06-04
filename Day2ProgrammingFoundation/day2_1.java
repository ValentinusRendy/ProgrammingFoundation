import java.util.Scanner;

public class day2_1 {
    public static void main (String[] args){
        try { 
            System.out.print("Masukkan umur anda: ");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            age = age +1;
            System.out.println("Next year: " + age);
            

        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }

    }
    
}
