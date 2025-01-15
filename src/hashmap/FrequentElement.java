package hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequentElement {

    static void Maxfeq(){
        Map<Integer,Integer> mp =new HashMap<>();
         int n =6;
         int[] arr = {2, 2, 3, 1, 2, 1};

         for(var element : arr){
             if(!mp.containsKey(element)){
                 mp.put(element,1);
             }
             else{
                 mp.put(element, mp.get(element)+1);
             }
         }
        System.out.println(mp.entrySet());

         int Maxfequency =-1;
         int ansKey =-1;
         for(var e:mp.entrySet()){
             if(e.getValue() >Maxfequency){
                 Maxfequency =e.getValue();
                 ansKey =e.getKey();
             }
         }
        System.out.println(Maxfequency+" "+ansKey);


    }
    public static void main(String[] args) {
        Maxfeq();

    }
}
