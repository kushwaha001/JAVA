package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo
{
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(23,"ad");
        map.put("null",23);
        map.put(true,45);
        System.out.println(map);
        System.out.println(map.get("null"));

        HashMap<String,Integer> map1= new HashMap<String, Integer>();
        map1.put("Ankit",45);
        map1.put("Ankit",85);
        map1.put("Naveen",67);
        map1.put("Anu",78);
        map1.put("Tej",32);
        map1.put("Aman",21);
        System.out.println("..."+map1);

        Set set1=map1.keySet();
        System.out.println(set1);

    }
}
