import java.util.*;
public class factorial {
    public static void factorial_1(int n){
        int ans=1;
        for(int i=n;i>=1;i--){
            ans=ans*i;
        }
        System.out.println(ans);
        return;
       // return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
       // System.out.println( factorial_1(n));
       factorial_1(n);
    }
    
}
