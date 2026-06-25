package CheckedException;

public class UncheckedExceptionDemo extends RuntimeException{
    public UncheckedExceptionDemo(String m){
        super(m);
    }
}
class UnCheck {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new UncheckedExceptionDemo("chia cho 0 không được cho phép");
        }
        System.out.println("Result: " + (a / b));
    }
    public static void main(String[] args) {
        try {
            divide(10,2);
        } catch (UncheckedExceptionDemo e){
            System.out.println("bắt lỗi: " + e.getMessage());
        }
    }

}
