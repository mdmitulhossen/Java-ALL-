class Test1 {
    String color="Black";
}
class Test2 extends Test1 {
    String color="White";
    void change(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class Super {
    public static void main(String[] args) {
        Test2 ob= new Test2();
        ob.change();
    }
}
