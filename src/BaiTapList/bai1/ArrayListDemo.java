package BaiTapList.bai1;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();




        li.add("java");
        li.add("python");
        li.add("C++");
        System.out.println("các phần tử trong Arraylist là:" + li);

        for (String in : li){
            System.out.println("phần tử: "+in);
        }
        li.remove(1);
        System.out.println("các phần tử trong Arraylist sau khi xóa index 1 là:" + li);

        System.out.println("truy xuất phần tử 1 trong ArrayList: "+li.get(1));

        System.out.println("kiểm tra xem có ptu java trong arraylist không: "+li.contains("java"));

        for(int i = 0; i <li.size(); i++){
            System.out.println("phần tử thứ "+i+" trong arraylist: "+li.get(i));

        }
    }
}
