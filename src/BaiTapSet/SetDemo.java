package BaiTapSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("B");

        for(String setIn : set){
            System.out.println("in ra cac ptu trong set:" +setIn);
        }
        System.out.println("ptu A có trong set không: "+set.contains("A"));

        System.out.println("xoa phan tu  D TRONG set: "+set.remove("D"));
        System.out.println("xem lại set sau khi xóa: "+set);

        System.out.println("using iterator: ");
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next()+",");
            System.out.println();

            // Using enhanced for loop to iterate Over the HashSet
            System.out.print("Using enhanced for loop : ");
            for (String element : set)
                System.out.print(element + " , ");
        }
    }
}
