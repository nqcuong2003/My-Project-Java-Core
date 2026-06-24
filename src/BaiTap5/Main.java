package BaiTap5;

public class Main {
    public static void main(String[] args) {
        Nguoi nguoi1 = new Nguoi();
        nguoi1.chaoHoi();
        Nguoi sv1 = new SinhVien();
        sv1.chaoHoi();
        MayTinh mt1 = new MayTinh();

        System.out.println("Tong 2 so nguyen: " + mt1.tinhTong(5,10));

        System.out.println("Tong 3 so nguyen : " + mt1.tinhTong(5,10, 15));
        System.out.println("Tong 2 so thuc : " + mt1.tinhTong(5.5,10.5));
    }
}
