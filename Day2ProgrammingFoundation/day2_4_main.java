import java.util.Scanner;

public class day2_4_main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        day2_4 myLogic = new day2_4();

        while (true){

            try{
                // Input Module
                Object[] CustomerData = myLogic.inputCustomerData();
                String name = (String) CustomerData[0];
                int age = (int) CustomerData[1];
                double salary = (double) CustomerData[2];
        
                // Logic Module
                String status = myLogic.approval(age, salary);

                // Logic Output
                myLogic.printCustomerResult(name, status);


                if (myLogic.isContinue()){
                    System.out.println("Program berhenti");
                    break;

                }

                } catch (NumberFormatException e){
                System.out.println("Masukkan input angka yang valid");
            } catch (Exception e){
                System.out.println("Masukkan input yang valid : "+ e.getMessage());
            }
        }
            sc.close();
    }

}