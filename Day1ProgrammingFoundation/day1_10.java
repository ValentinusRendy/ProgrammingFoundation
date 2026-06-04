import java.util.Scanner;

public class day1_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String stops = "t,T,no,stop";
        while (true){
            System.out.println("Hello");
            System.out.println("Apakah mau lanjut (y/t?)");

            String answer = sc.nextLine();

            if (stops.contains(answer.toLowerCase())){
                System.out.println("Program berhenti");
                break;
            }
        }
    }
}