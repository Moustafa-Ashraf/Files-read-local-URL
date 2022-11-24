import java.io.BufferedReader;
import java.io.FileReader;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter: file = 0, URL = 1");
        int t = scan.nextInt();


        try {

            //Read the file in a buffer
            String line;
            int count = 0;
            if(t == 0) {
                System.out.println("Enter the file name");
                String x = scan.next();
                FileReader file = new FileReader(x);
                System.out.println("#############");
                BufferedReader br0 = new BufferedReader(file);
                //Iterate over buffer lines, line by line
                while ((line = br0.readLine()) != null) {
                    //Splits words by spaces
                    String words[] = line.split(" ");
                    //Counts each cell in the array
                    count = words.length;
                }
                System.out.println("Number of words present in given file: " + count);
                br0.close();
            }
            else{
                System.out.println("Enter the URL");
                String x = scan.next();
                URL oracle = new URL(x);
                BufferedReader br1 = new BufferedReader(new InputStreamReader(oracle.openStream()));
                //Iterate over buffer lines, line by line
                while ((line = br1.readLine()) != null) {
                    //Splits words by spaces
                    String words[] = line.split(" ");
                    //Counts each cell in the array
                    count = words.length;
                }
                System.out.println("Number of words present in given file: " + count);
                br1.close();
            }

        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}