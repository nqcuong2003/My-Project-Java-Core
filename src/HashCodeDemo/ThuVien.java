package HashCodeDemo;

import java.util.HashSet;

public class ThuVien {
    public static void main(String[] args) {
        HashSet<HashCodeDemoSach> khoSach= new HashSet<>();

        HashCodeDemoSach cuon1 = new HashCodeDemoSach("123","Cuon theo chieu gio");
        HashCodeDemoSach cuon2 = new HashCodeDemoSach("123","Cuon theo chieu gio");

        khoSach.add(cuon1);
        System.out.println("kho da co cuon sach nay chưa: "+khoSach.contains(cuon2));
        System.out.println("kho da co cuon sach nay chưa: "+khoSach.contains(cuon1));
        System.out.println("tong so sach trong kho: "+khoSach.size());
    }
}
