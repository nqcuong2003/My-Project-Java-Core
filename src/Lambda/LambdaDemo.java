package Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        //1. không có tham số: dùng cặp ngoặc đơn rỗng ()
        //() -> System.out.println("Xin chào!");

        //2. có một tham số: có thẻe bỏ ngoặc đơn bao quanh tham số
        // ví dụ: ten -> System.out.println("chào "+ten");

        //3. có nhiều tham số buộc phải có ngoặc đơn
        // ví dụ: (a,b) -> System.out.println(a + b);

        //4. Thân hàm có trả về giá trị return và chỉ có 1 dòng: bỏ chữ return và {}
        // ví dụ: (a,b) -> a * b;

        //5. thân hàm có nhiều dòng: bắt buộc dùng ngoặc nhọn {} và chữ return nếu cần
        /* ví dụ:
            (a, b) -> {
                int tong = a +b;
                return tong;
            }
         */
    }
}
