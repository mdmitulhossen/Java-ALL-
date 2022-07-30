//single inheritace
class A{
    String a="class A";
}
class B extends A{
    String b="Class B extends A";
}
// Multilevel inheritace
class X{
    String x="class X";
}
class Y extends X{
    String y="Class Y extends X";
}
class Z extends Y{
    String z="Class Z extends Y";
}
//  Hierarchical inheritace
class L{
    String l="class L";
}
class M extends L{
    String m="Class M extends L";
}
class N extends L{
    String m="Class N extends L";
}

public class Inheritance {
    public static void main(String[] args) {
        B o1=new B();
        Z o2= new Z();
        N o3 = new N();
        M o4 = new M();
        System.out.println("Single Inheritace....");
        System.out.println(o1.a);
        System.out.println(o1.b);
        System.out.println("Multilevel Inheritace....");
        System.out.println(o2.x);
        System.out.println(o2.y);
        System.out.println(o2.z);
        System.out.println("Hierarchical Inheritace....");
        System.out.println(o3.l);
        System.out.println(o3.m);
        System.out.println(o4.m);
    }
}
