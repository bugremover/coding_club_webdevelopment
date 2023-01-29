import java.util.*;
public class sub_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sum to find :");
        int k=sc.nextInt();
        int sum;
        for(int j=0;j<n;j++){
            sum=arr[j];
            for(int l=j+1;l<=n;l++){
                if(sum==k){
                    int lo=l-1;
                    System.out.println(j +""+lo);
                }
                if(sum>k){
                    break;
                }
                if(l<n){
                    sum=sum+arr[l];
                }
            }
            System.out.println("not fouund");
        }
        
    }
}
