class Private{
        private int x=10;
}

class Modifier extends Private{
    
    public void m1(){
        System.out.println("public");
    }
    protected void m2(){
        System.out.println("protected");
    }
   void m3(){
        System.out.println(super.x);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Modifier ob = new Modifier();
        ob.m1();
        ob.m2();
        ob.m3();
    }
}
