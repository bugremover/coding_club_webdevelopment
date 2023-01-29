import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Arlist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
       //add element
        list.add(0);
        list.add(4);
        list.add(1);
        System.out.println(list);
        //get element
       // int element=list.get(2);
        //System.out.println(element);
        ////add element in between;
        //list.add(1,3);
        //System.out.println(list);
        //set element
       // list.set(2,6);
        //System.out.println(list);
        //Scanner sc=new Scanner(System.in);
        //int i=sc.nextInt();
        //int e=sc.nextInt();
        //list.add(i,e);
        //removing elements
        //list.remove(3);
        System.out.println(list);
        int size=list.size();
        System.out.println(size);
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }
    
}
