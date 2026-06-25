package Optional;

import java.util.Optional;

// b1: đóng gói vào hộp
public class OptionalDemo {
    public Optional<String> layEmailSinhVien(String id){
        String email = "sv999@truong.edu.vn";
        return Optional.ofNullable(email);
    }
}

