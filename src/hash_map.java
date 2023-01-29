import java.util.*;
public class hash_map {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",799798);
        map.put("USA",30948903);
        map.put("China",203489028);
        System.out.println(map);
        if(map.containsKey("India")){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }
        System.out.println(map.get("India"));
    }
    
}
