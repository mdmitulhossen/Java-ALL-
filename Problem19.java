class Outer{
    void display(){
        System.out.println("Outer class......");
    }
}
class Inner extends Outer{
    void display(){
        System.out.println("Inner class......");
    }
}

public class Problem19 {
    public static void main(String[] args) {
        Outer ob1= new Outer();
        Inner ob2 = new Inner();
        ob1.display();
        ob2.display();
    }
}
