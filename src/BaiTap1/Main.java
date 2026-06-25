package BaiTap1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NgoiNha nn1 = new NgoiNha("xanh",10);

        nn1.thongTin();

        NgoiNha nn2 = new NgoiNha("tim", 15);
        nn2.thongTin();

        NgoiNha nn3 = new NgoiNha();


        NgoiNha nn4 = new NgoiNha("tim");
        }
    }