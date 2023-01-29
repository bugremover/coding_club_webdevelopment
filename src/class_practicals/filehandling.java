package class_practicals;

import java.io.File;
import java.util.*;
public class filehandling{
    public static void main(String[] args) throws Exception {
        String filename="hello.txt";
        File myfile=new File(filename);
        Scanner sc = new Scanner(myfile);
        String first_name=sc.next();
        System.out.println(first_name);

    }
}