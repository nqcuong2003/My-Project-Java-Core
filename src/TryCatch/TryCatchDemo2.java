package TryCatch;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        try{
            System.out.println("khối try bên ngoài bắt đầu");
            try{
                int n = 10;
                int res = n/0;
            }
            catch (ArithmeticException e){
                System.out.println("Exception: caught: "+e);
            }
            try {
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("Exception: caught: " + e);
            }
        } catch (Exception e ) {
            System.out.println("Exception: caught: " + e);
        }
        finally {
            System.out.println("khối lệnh cuối cùng được thực thi");
        }
        System.out.println("chương trình tiếp tục sau khi các khối try-catch lồng nhau");
    }
}
