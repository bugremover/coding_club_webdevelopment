import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println(fact);

    }
    
}
