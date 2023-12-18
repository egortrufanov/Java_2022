package lab5;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;


public class ListOfNumbers2 {
    
 private static ArrayList<Integer> arr;
    private static final int SIZE = 10;

    public ListOfNumbers2() {
        arr = new ArrayList<>();
//        int i;
//        for (i = 0; i < SIZE; i++)
////            arr.add(new Integer(i));
//            arr.add(i);
    }

   
    public static void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));
        
            for (int i = 0; i < arr.size(); i++)
                out.println("Value at: " + i + " = " + arr.get(i));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void readList() {
        try(BufferedReader br = new BufferedReader(new FileReader("src/lab5/input.txt"))){
            String st;
            Pattern pattern = Pattern.compile("\\s+");
            while((st = br.readLine()) != null){
                String[] result = pattern.split(st);
                for(String i : result){
                    arr.add(Integer.valueOf(i));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
        readList();
        writeList();
    }
}



