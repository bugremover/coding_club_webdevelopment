import java.util.*;
public class harsha{

    
    
    public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n]; 
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt(); }
    int sum1=0;
    int sum2=0; 
    for (int i=0;i<n;i++){ 
        sum1=0;
    
    sum1=sum1+a[i];
     if (sum1<0) {
        sum1=0;
    }
    if(sum1>sum2){
    sum2=sum1;
    }
    }
     System.out.println(sum2);
}
}