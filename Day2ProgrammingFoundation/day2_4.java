import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class day2_4 {

  // by Manual Input
  public static String status;
  public static final int MIN_AGE = 21;
  public static final double MIN_SALARY_BOT = 3000000;
  public static final double MIN_SALARY_TOP = 8000000;

  public static Scanner sc = new Scanner(System.in);
  

  public static Object[] inputCustomerData() {
    System.out.print("Masukkan nama anda: ");
    String name = sc.nextLine();
    if (!name.matches("^[A-Za-z ]+$")) {
      throw new InputMismatchException("Masukkan nama yang valid");
    }
    System.out.print("Enter umur anda: ");
    int age = sc.nextInt();
    System.out.print("Enter penghasilan anda: ");
    double salary = sc.nextFloat();
    return new Object[] { name, age, salary };
  }


public static String approval(int age, double salary){

    if (age < MIN_AGE){
        status = "Tidak eligible";

    } else if(salary >= MIN_SALARY_BOT && salary <= MIN_SALARY_TOP) {
        status = "Manual review";
    }else if (salary < MIN_SALARY_BOT){
        status = "Tidak eligible";
    } else if (age >= MIN_AGE && salary >= MIN_SALARY_BOT){
        status = "Eligible";
    } else{
        status = "Tidak eligible";
    }

    return status;
  }

public static void printCustomerResult(String name, String status) {
  System.out.println(String.format("%s %s", name, status));
}

public static boolean isContinue() {
  String messageToStops = "t,n,tidak,no";

  System.out.print("Apakah mau lanjut (y/t)? ");
  sc.nextLine();
  String message = sc.nextLine();
  

  if (messageToStops.contains(message.toLowerCase())) {
    return true;
  }
  return false;
}





// Read File

public static List<String[]> readFile(String filename){
    List<String[]> results = new ArrayList<>();

    try{
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        sc.nextLine();

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] values = line.split(",");
            results.add(values);

        } 
        sc.close();
    } catch(FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        }

    return results;
    } 


  public static List<String[]> approvalReadFile(List<String[]> customersData){

    List<String[]> results = new ArrayList<>();

    for(String customer []: customersData){
      String name = (String) customer[0];
      int age = Integer.parseInt(customer[1]);
      double salary = Double.parseDouble(customer[2]);

      if (age < MIN_AGE){
        status = "Tidak eligible";
      } else if(salary >= MIN_SALARY_BOT && salary <= MIN_SALARY_TOP) {
          status = "Manual review";
      }else if (salary < MIN_SALARY_BOT){
          status = "Tidak eligible";
      } else if (age >= MIN_AGE && salary >= MIN_SALARY_BOT){
          status = "Eligible";
      } else{
          status = "Tidak eligible";
      }


      String[] obj = new String[2];
      obj[0] = name;
      obj[1] = status;

      results.add(obj);

    }
    return results;

  }

  public static void printResultReadFile(List<String[]> approvalStatus) {
    for(String[] approvalCustomer : approvalStatus){
      String name = approvalCustomer[0];
      String status = approvalCustomer[1];

      System.out.println(String.format("Name: %s --> Decision: %s", name, status));
    }
}




}