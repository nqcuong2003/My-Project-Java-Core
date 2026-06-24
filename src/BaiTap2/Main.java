package BaiTap2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        TaiKhoanNganHang tk1 = new TaiKhoanNganHang(1000);

        System.out.println("So du ban dau:"+tk1.getSoDu());
        tk1.napTien(500);
        System.out.println("So du hien tai:"+tk1.getSoDu());
        tk1.napTien(-500);
        System.out.println("So du hien tai:"+tk1.getSoDu());
    }


}
