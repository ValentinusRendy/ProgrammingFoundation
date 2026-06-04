import java.util.List;

public class day2_4_main2{
    public static void main(String[] args){
        if (args.length < 1){
            System.out.println("Masukkan dulu nama file");
            return;
        }

        else{
            String filename = args[0];
            day2_4 myLogic = new day2_4();

            try{
                // modul input
                List<String[]> customersData = myLogic.readFile(filename);

                // modul logic
                List<String[]> approvalStatus = myLogic.approvalReadFile(customersData);

                // modul output
                myLogic.printResultReadFile(approvalStatus);
            
            } catch (Exception e){
                System.out.println("Isi file input tidak valid : "+ e.getMessage());
            } 

        }
    }
}