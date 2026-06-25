package Lambda;

public class LambdaThreadExample {
    public static void main(String[] args) {

        //cach cu
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Luong 1 dang cahy theo cach cu,...");
            }
        };
        // cach moi (dung lambda), vi runnable khong co tham so dau vao ta dung ()

        Runnable r2 = () -> System.out.println("luong 2 dang chay lambda");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
