package BaiTapStackAndHeap;

public class StackAndHeapDemo {
    int id;
    String name;
    double salary;

    public StackAndHeapDemo(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void disPlay(){
        System.out.println("id la: "+this.id);
        System.out.println("name la: "+this.name);
        System.out.println("salary la: "+this.salary);
    }
}
