package CheckedException;

public class CheckedExceptionDemo extends Exception{
    public CheckedExceptionDemo(String m){
        super(m);
    }
}

class check {
    public static void validate(int age)
            throws CheckedExceptionDemo {
        if (age < 18) {
            throw new CheckedExceptionDemo("phai du 18 tuoi");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validate(19);
        } catch (CheckedExceptionDemo e){
            System.out.println("bắt lỗi: " + e.getMessage());
        }
    }
}
