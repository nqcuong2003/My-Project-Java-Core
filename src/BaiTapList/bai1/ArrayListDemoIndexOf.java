package BaiTapList.bai1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoIndexOf {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);

        System.out.println("indexOf(2): " + list.indexOf(2));
        System.out.println("indexOf(2): " + list.lastIndexOf(2));
    }
}
