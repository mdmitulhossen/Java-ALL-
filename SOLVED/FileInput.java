import java.io.*;
import java.util.Scanner;
public class FileInput {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            FileOutputStream fout=new FileOutputStream("E:\\abc.txt");
            System.out.println("Enetr the text::");
            String s=sc.nextLine();
            byte b[]=s.getBytes();
                fout.write(b);
                fout.close();
                System.out.println("Success");
            
        
        
        }catch(Exception e){
            System.out.println(e);
        }
    }    
}
