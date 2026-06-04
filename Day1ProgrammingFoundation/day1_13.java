import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class day1_13{
    public static void main(String[] args){

        try{
            // File file = new File("test2.txt");
            // Scanner reader = new Scanner(file);

            // while (reader.hasNextLine()){
            //     String line = reader.nextLine();
            //     System.out.println(line);

            // }

            FileWriter writer = new FileWriter("test2.txt",true);

            writer.write("Haloo...\n");
            writer.write("Haloo juga...\n");

            writer.close();

        } catch(IOException e){
            System.out.println("File tidak ditemukan");

        }

    }
}