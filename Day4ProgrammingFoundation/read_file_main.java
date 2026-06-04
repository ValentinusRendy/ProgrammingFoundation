import java.util.List;

import ModelJava.Customer;
import ModelJava.RiskAssesor;


public class read_file_main{
    public static void main(String[] args){
        if (args.length < 1){
            System.out.println("Masukkan dulu nama file");
            return;
        }

        else{
            String filename = args[0];
            read_file_function myLogic = new read_file_function();
            RiskAssesor myAsses = new RiskAssesor();

            try{
                // modul input
                List<Customer> customersData = myLogic.readFile(filename);

                // modul logic
                List<String[]> approvalStatus = myLogic.RiskAssesorLogic(customersData);

                // modul output
                myLogic.printResultReadFile(approvalStatus);

                myLogic.printSummary(approvalStatus);
            
            } catch (Exception e){
                System.out.println("Isi file input tidak valid : "+ e.getMessage());
            } 

        }
    }
}