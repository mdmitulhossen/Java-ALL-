
public class Outer {
    class Inner{
        void display(){
            System.out.println("Inner class......");
        }
    }
    void display(){
        System.out.println("Outer class......");
    }
    public static void main(String[] args) {
        Outer ob = new Outer();
        Outer.Inner ob2 = ob.new Inner();
       
        ob.display();
        ob2.display();
    }
}
