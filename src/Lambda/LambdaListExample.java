package Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaListExample {
    public static void main(String[] args) {
        List<String> danhSach = Arrays.asList("apple", "banana","orange");

        // cach cu (dung vong lap for-each)
        System.out.println("------cach cu--------");
        for(String traiCay : danhSach){
            System.out.println(traiCay);
        }

        //cach moi (dung lambda)
        //() -> {};
        System.out.println("------cach moi----------");
        danhSach.forEach(traiCay -> System.out.println(traiCay));
    }
}
