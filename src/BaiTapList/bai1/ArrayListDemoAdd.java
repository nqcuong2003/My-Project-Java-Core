package BaiTapList.bai1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoAdd {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("haha");
        list.add("hihi");
        list.add(0,"hoho");

        for(String list1 : list){
            System.out.println("in ra cac ptu trong list: " +list1);
        }
    }
}
