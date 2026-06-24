package BaiTap2;

public class TaiKhoanNganHang {
    private double soDu;

    public TaiKhoanNganHang(double soDu){
        this.soDu = soDu;
    }
    public double getSoDu(){
        return this.soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public void napTien(double soTien){
        if(soTien > 0 ){
            soDu += soTien;
            System.out.println("Nap tien thanh cong!");
        } else {
            System.out.println("so tien khong hop le!");
        }
    }
}
