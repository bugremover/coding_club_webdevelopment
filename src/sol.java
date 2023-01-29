import java.util.Scanner;

public class sol {
    public static void sum_even(int a,int b){
        int sum=0;
        if(a%2!=0){
            a++;
        }
        for(int i=a;i<=b;i+=2){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sum_even(n, m);
        
    }
    
}
