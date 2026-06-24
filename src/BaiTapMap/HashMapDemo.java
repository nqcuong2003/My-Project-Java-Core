package BaiTapMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"three");
        hashMap.put(4,"four");

        for(Integer key : hashMap.keySet()){
            String value = hashMap.get(key);
            System.out.println(key + "-->"+value);
        }
        System.out.println("--------------------");

        for(Map.Entry<Integer, String> e : hashMap.entrySet())
            System.out.println("Key: "+ e.getKey() + "Value: " +e.getValue());

        System.out.println("--------------------");

        System.out.println("in ra ptu ben trong hashMap: "+hashMap);

        hashMap.put(2,"hai");
        System.out.println("in ra ptu ben trong hashMap sau khi cập nhật: "+hashMap);

        hashMap.remove(4);
        System.out.println("in ra ptu ben trong hashMap sau khi xóa: "+hashMap);


    }
}
