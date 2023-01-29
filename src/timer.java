import java.util.*;
public class timer{
    public static void get_time(int x){
        int sec=x%60;
        int min=x/60;
        System.out.printf("%d:%02d",min,sec);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        get_time(n);

    }
}