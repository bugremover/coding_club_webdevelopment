//merging two arrays--------
import java.util.*;
public class array_1 { 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int n=sc.nextInt();
        System.out.println("enter size of second array:");
        int m=sc.nextInt();
        int[] a1=new int[n];
        int[] b1=new int[m];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("enter elements");
        for(int i=0;i<m;i++){
            b1[i]=sc.nextInt();
        }
        int[] c1=new int[n+m];
        for(int i=0;i<n;i++){
            c1[i]=a1[i];
        }
        for(int i=0;i<m;i++){
            c1[n+i]=b1[i];
        }
        System.out.println("elements by merging two arrays:");
        for(int i=0;i<(n+m);i++){
            System.out.println(c1[i]);
        }
        int size=c1.length;
        sorting1(c1,size);
            
            
    }
    static void sorting1(int[] arr,int n){
        System.out.println("sorted array of c1");
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] >arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
                System.out.println();
            }

    }
}
