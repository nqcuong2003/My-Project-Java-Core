package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaFilterExample {
    public static void main(String[] args) {
        List<Integer> soKyTu = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        soKyTu.removeIf(so -> so % 2 == 0);

        System.out.println("danh sach sau khi xoa so chan: "+ soKyTu);
    }
}
