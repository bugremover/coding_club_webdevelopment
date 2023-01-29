import java.util.*;
public class solution_1 {
    public static void sum_odd(int n,int m){
        int sum=0;
        if(n%2 ==0){
            n++;
        }
        for(int i=n;i<=m;i=i+2){
            sum=sum+i;
        }
        System.out.println("sum of odd number between "+n+"and"+m+"is:"+sum);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("start:");
        int n=sc.nextInt();
        System.out.println("end:");
        int m=sc.nextInt();
        sum_odd(n, m);
    }
    
}
