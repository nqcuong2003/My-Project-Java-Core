package BaiTapStackAndHeap;

public class Main {
    public static void display(StackAndHeapDemo emp){
        emp.disPlay();
    }

    public static void main(String[] args) {
        StackAndHeapDemo emp1 = new StackAndHeapDemo(1,"Cuong", 1000);
        StackAndHeapDemo emp2 = new StackAndHeapDemo(2,"Cuong2", 2000);
        display(emp1);
        display(emp2);
    }



}
