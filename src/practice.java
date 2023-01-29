import java.util.*;
public class practice {
    public static void solution(int n){
        Scanner sc=new Scanner(System.in);
        float[] m=new float[n];
        for(int i=0;i<n;i++ ){
            m[i]=sc.nextInt();
        }
        float add=0;
        for(int i=0;i<n;i++){
            add=add+m[i];
        }
        float average=(add/n);
        System.out.println("average of is "+average);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number you want to enter:");
        int n=sc.nextInt();
        solution(n);
    }
    
}
