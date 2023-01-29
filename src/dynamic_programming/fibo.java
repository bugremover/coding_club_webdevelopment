package dynamic_programming;

import java.util.*;

public class fibo {
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
       a[0]=0;
       a[1]=1;
       for(int i=2;i<n;i++){
        a[i]=a[i-1]+a[i-2];
       }
       System.out.println("fibo series");
       for(int i=0;i<n;i++){
        System.out.println(a[i]);
       }
    }
    
}
