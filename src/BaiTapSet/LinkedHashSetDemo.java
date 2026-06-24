package BaiTapSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> l1 = new LinkedHashSet<String>();


        l1.add("Cuong");
        l1.add("Tuyen");
        l1.add("Cuong");
        l1.add("Phuong");
        System.out.println("in ra l1: "+l1);

        System.out.println("xoa ptu Phuong: "+l1.remove("Phuong"));
        System.out.println("in ra l1: "+l1);

        for(String ll:l1){
            System.out.println("in ra cac ptu trong l1:"+ll);
        }
//        for (String s : l1)
//            System.out.print(s + ", ");
//        System.out.println();
    }
}
