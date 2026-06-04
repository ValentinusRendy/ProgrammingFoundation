import java.util.*;

public class big {
    public static void main(String[] args){

        ArrayList<String> applicants = new ArrayList<>();
        HashSet<String> existingLoan = new HashSet<>();

        applicants.addAll(Arrays.asList("Rina", "Budi", "Andi", "Sar"));
        existingLoan.addAll(Arrays.asList("Budi", "Budi", "Sari"));

        // System.out.println(existingLoan);


        // Set<String> existingLoanSet = new HashSet<>();
        // Collections.addAll(existingLoanSet, "Budi", "Sari");

        
        
        // for (String cust : applicants){
        //     String status = "Normal";
        //     for (String user : existingLoan){
        //         if (cust.equals(user)){
        //             status = "Manual Review";
        //         }
        //     }
        //     System.out.println(cust + " ---> " + status);
        // }

        
        for (String cust : applicants){
            String status = "Normal";
            if (existingLoan.contains(cust)){
                status = "Manual Review";
            }
            System.out.println(cust + " ---> " + status);
        }
    }
}
