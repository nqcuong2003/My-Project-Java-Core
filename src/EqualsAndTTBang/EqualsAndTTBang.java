package EqualsAndTTBang;


public class EqualsAndTTBang {
    String name;

    public EqualsAndTTBang(String name){
        this.name=name;
    }

    int a = 25;
    int b = 25;

    public void display(){
        if(a==b){
            System.out.println("a bang b");
        } else{
            System.out.println("a khong bang b");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EqualsAndTTBang other = (EqualsAndTTBang) obj;
        return this.name.equals(other.name);
    }
}
