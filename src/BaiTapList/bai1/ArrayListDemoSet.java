package BaiTapList.bai1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Cuong");
        list.add("Tuyen");
        list.add("Phuong");
        System.out.println("in ra cac ptu cua list: "+list);

        for(String listIn : list){
            System.out.println("in ra cac ptu ban dau cua list: "+listIn);
        }

        list.set(1, "cuong1");
        for(String listIn : list){
            System.out.println("in ra cac ptu sau khi thay doi: "+listIn);
        }
    }
}
