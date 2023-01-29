import java.util.Scanner;

public class Pizza {
    private int size;
    private int toppings;
    public static final int SMALL=0;
    public static final int MEDIUM=1;
    public static final int LARGE=2;
    private static final int SBP=50;
    private static final int MBP=100;
    private static final int LBP=150;
    private static final int TP=20;
    

    public Pizza(int size,int toppings){
        this.size=size;
        this.toppings=toppings;
    }
    public double getprice(){
        return this.sizeprice()+this.toppingsprice();
        

    }
    {
        System.out.println(this);
    }
    private double sizeprice(){
        switch(this.size){
            case SMALL: return SBP;
            case MEDIUM:return MBP;
            case LARGE:return LBP;
        }
        return 0;
    }
    private double toppingsprice(){
        return this.toppings * TP;
    }
    
}
class Eat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int s=sc.nextInt();
        int t=sc.nextInt();
        Pizza p=new Pizza(s,t);
        

        
        System.out.println(p.getprice());
    }
}
