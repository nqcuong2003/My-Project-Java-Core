package BaiTapStackAndHeap;


public class MainDemo {
    public static int add(int a, int b){
        int res = a+b;
        return res;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a,b);
        System.out.println("tong la: "+sum);
    }
}
