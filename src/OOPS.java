
import java.util.*;

class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

public class OOPS {
    public static void main(String args[]){
        String name;
        int age;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        age=sc.nextInt();
        Student s1=new Student(name,age);
        s1.printinfo();
    }
    
}
