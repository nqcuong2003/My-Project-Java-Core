package Optional;

import java.util.Optional;

public class Main {
    //cách 1: lấy dự phòng orElse()
    public static void main(String[] args) {
        OptionalDemo demo = new OptionalDemo();
        Optional<String> hopEmail = demo.layEmailSinhVien("sv999");
        String ketQua = hopEmail.orElse("chuacapnhat@truong.edu.vn");
        System.out.println(ketQua);

        //cách 2: nếu có thì làm gì đó ifPresent(), kết hợp Lambda
        // "nếu hộp có email thi hay in nó ra , còn rỗng thì thôi, đi tiếp
        OptionalDemo demo1 = new OptionalDemo();
        Optional<String> hopEmail1 = demo1.layEmailSinhVien("sv999");
        hopEmail1.ifPresent(email -> System.out.println("gui thu toi: "+email));

        //cách 3: nếu rỗng thì ném lỗi - orElseThrow()
        //"tôi bắt buộc phải có email, nếu hộp rỗng thì ném ra Custom Exception luôn!"
        OptionalDemo demo2 = new OptionalDemo();
        Optional<String> hopEmail2 = demo2.layEmailSinhVien("sv999");
        String ketQua2 = hopEmail2.orElseThrow(() -> new RuntimeException("không tìm thấy!"));
    }
}
