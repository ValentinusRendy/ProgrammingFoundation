import java.util.HashMap;
import java.util.ArrayList;


public class demo_summary {
    public static void main(String[] args){
        HashMap<String, Integer> summary = new HashMap<>();

        summary.put("Eligible",0);
        summary.put("Not Eligible",0);
        summary.put("Manual Review",0);

        System.out.println(summary);

        summary.put("Eligible", summary.get("Eligible")+1);

        System.out.println(summary);



        
    }
}
