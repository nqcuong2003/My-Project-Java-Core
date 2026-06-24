package BaiTap4;

public class Chim extends DongVat implements CoTheBay {
    @Override
    public void Bay() {
        System.out.println("chim bay");
    }

    @Override
    public void taoAmThanh() {
        System.out.println("chíp chíp");
    }
}
