import java.util.Scanner;

public class day1_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan sebuah huruf: ");
        String huruf = sc.next();

        huruf = huruf.toLowerCase();

        String vokal = "aiueo";

        if (vokal.contains(huruf)){
            System.out.println(huruf + " adalah vokal");
        } else{
            System.out.println(huruf + " adalah konsonan");
        }

        sc.close();

    }
}