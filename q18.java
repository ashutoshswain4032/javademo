import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        /*File myfile=new File("random.txt");
        try {
            myfile.createNewFile();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                try{
                FileWriter fileWriter = new FileWriter("random.txt") ;
            fileWriter.write("this is our first file creation.i am ashutosh swain.");
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        File myfile=new File("random.txt");
        try{
            Scanner t=new Scanner(myfile);
            while(t.hasNextLine()){
                String s=t.nextLine();
                System.out.println(s);
            }
            t.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
