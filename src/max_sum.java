import java.util.*;
public class max_sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum1=0;
        int sum2=0;
        int las=0;
        int first=0;
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){

            sum1=a[i]+sum1;
            if(sum1<0){
                sum1=0;

            }
            if(sum1>sum2){
                sum2=sum1;
                las=i;


            }


        }

       
        System.out.println("max :"+sum2);


    }
}
