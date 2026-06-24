package EqualsAndTTBang;

public class Main {
    public static void main(String[] args) {
        EqualsAndTTBang obj1 = new EqualsAndTTBang("Cuong");
        EqualsAndTTBang obj2 = new EqualsAndTTBang("Cuong");


        obj1.display();
        System.out.println("obj1 có bằng obj2 không: "+obj1.equals(obj2));
        System.out.println(obj1 == obj2);
    }
}
