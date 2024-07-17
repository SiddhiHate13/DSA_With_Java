import java.util.*;

public class hashingEg {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Siddhi",1);
        myMap.put("Divya",2);
        myMap.put("Div",3);
        for(String mykey: myMap.keySet()){
            System.out.println(mykey);
        }

        System.out.println(myMap);
        
        System.out.println(myMap.containsKey("Siddhi"));
        System.out.println(myMap.containsKey("Deepa"));

        
    }
}
