abstract class Abs1{
   abstract void m1();
}
class Abs2 extends Abs1{
    void m1(){System.out.println("ABSTRACT.......");}
}

public class Abstract {
    public static void main(String[] args) {
        Abs1 o=new Abs2();
        o.m1();
    }
}
