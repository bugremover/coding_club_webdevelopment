import java.util.*;
public class add {
    public static int add_numbers(int n,int m){
        int sum=n+m;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum= add_numbers(n, m);
        System.out.println(sum);

    }
    
}
