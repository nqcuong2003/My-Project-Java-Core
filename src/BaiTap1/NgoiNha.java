package BaiTap1;

public class NgoiNha {
    String mauSac;
    int soCuaSo;

    public NgoiNha(String mauSac, int soCuaSo){
        this.mauSac = mauSac;
        this.soCuaSo = soCuaSo;
    }

    public NgoiNha(){

    }
    public NgoiNha(String mauSac){
        this.mauSac = mauSac;
    }


    public void thongTin(){
        System.out.println("Nha mau " +this.mauSac + " co " + this.soCuaSo+" cua so");

    }
}
