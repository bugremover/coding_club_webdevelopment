import java.util.Scanner;
public class marks {
    public class grade {
        public static void percentage(float x,float t){
            
            float per=(x/t)*100;
            System.out.printf("percentage:%.2f",per);
            System.out.println();
            if(x<=t){
            
            if(per>=0 && per<=39.9){
                System.out.println("D");
            }else if(per>=40 && per <=59.9){
                System.out.println("C");
            }else if(per>=60 && per<=79.9){
                System.out.println("B");
            }else if(per>=80 && per<=100){
                System.out.println("A");
            }
            else{
                System.out.println("Enter marks in positive ");
            }
        }
        else{
            System.out.println("marks should be equal or lessthan"+ t);
        }
        
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();
        float t=sc.nextFloat();
        percentage(n,t);

    }
    
}
}


   