package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Basicmap {
    static void HashMapMethod(){
        Map<String,Integer> mp =new HashMap<>();

        mp.put("Ram",26);
        mp.put("shyam",25);
        mp.put("pravat",24);
        mp.put("Ramesh",22);
        mp.put("suresh",20);

        System.out.println(mp.get("Ram")); // to print value

        mp.put("Ram",25); //use to update value
        System.out.println(mp.get("Ram"));

        System.out.println(mp.remove("pravat")); //if exist return value to remove

        System.out.println(mp.remove(("he"))); //if exist return null if key value is not exist


        System.out.println(mp.containsKey("shyam"));//return true if exist and false if not exist

        mp.putIfAbsent("yash",44); //it will add if not present
        mp.putIfAbsent("Ram",66); //it will not add if present

        System.out.println(mp.keySet()); //it will return all key

        System.out.println(mp.values()); //it will print all value

        System.out.println(mp.entrySet()); // return both key and value


        for(var key : mp.keySet()){
            System.out.printf("Age of %s is %d \n" ,key ,mp.get(key));
        }

        for(Map.Entry<String,Integer> e :mp.entrySet()){
            System.out.printf("Age of %s is %d \n" ,e.getKey() ,e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethod();
    }

}
