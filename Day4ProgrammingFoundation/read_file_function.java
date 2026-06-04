import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import ModelJava.Customer;
import ModelJava.RiskAssesor;

public class read_file_function {

  // by Manual Input
public static String status;
public static final int MIN_AGE = 21;
public static final double MIN_SALARY_BOT = 3000000;
public static final double MIN_SALARY_TOP = 8000000;

// Read File

public static List<Customer> readFile(String filename){
    List<Customer> results = new ArrayList<>();
  
    try{
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        sc.nextLine();

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] values = line.split(",");
            String name = values[0];
            int age = Integer.parseInt(values[1]);
            double salary = Double.parseDouble(values[2]);
            ModelJava.Customer cust = new ModelJava.Customer(name,age,salary);

            results.add(cust);
        } 
        sc.close();
    } catch(FileNotFoundException e){
            System.out.println("File tidak ditemukann");
        }

    return results;
    } 


  public static List<String[]> RiskAssesorLogic(List<Customer> customersData){
    RiskAssesor myAsses = new RiskAssesor();
    return myAsses.assessCustomers(customersData);
  }

  public static void printResultReadFile(List<String[]> approvalStatus) {
    for(String[] approvalCustomer : approvalStatus){
      String name = approvalCustomer[0];
      String status = approvalCustomer[1];

      System.out.println(String.format("Name: %s --> Decision: %s", name, status));
    }
}


  public static void printSummary(List<String[]> approvalStatus) {
    HashMap<String, Integer> summary = new HashMap<>();

    summary.put("Tidak eligible", 0);
    summary.put("Eligible", 0);
    summary.put("Manual review", 0);
    
    for(String[] approvalCustomer : approvalStatus){
      summary.put(approvalCustomer[1], summary.get(approvalCustomer[1]) + 1);
    }

    System.out.println();
    System.out.println("Summary: ");
    System.out.println(summary);
}

}