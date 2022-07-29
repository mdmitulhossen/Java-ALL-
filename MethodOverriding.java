class Parent{
    void m1(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    void m1(){
        System.out.println("Child Class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("java");
        Child obj = new Child();
        obj.m1();
    }
}
