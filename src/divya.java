import java.io.File;
import java.util.Scanner;

public class divya {
    public static void main(String[] args) throws Exception {
        File file=new File("C:\\Users\\harsha\\java_codes\\java_practicals\\src\\New.txt");
        Scanner sc =new Scanner(file);
        String a=sc.nextLine();
        System.out.println(a);
    }
    
}
