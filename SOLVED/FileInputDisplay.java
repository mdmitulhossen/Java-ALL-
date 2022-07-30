import java.io.*;
import java.util.*;
public class FileInputDisplay {
    public static void main(String[] args) {
        File file = new File("E:\\abc.txt");
        try{
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(Exception e){
            System.out.println("File not found");
        }
    }
}
