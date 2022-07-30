class parent1{
    void show(){
        System.out.println("Parent1 class.....");
    }
}
class parent2{
    void print(){
        System.out.println("Parent2 class.....");
    }
}
class Test extends parent1,parent2 {
    void display(){
        System.out.println("child class.....");
    }
}
//if i do it run when show compile time error(doesn't support)
public class Multiple {
    public static void main(String[] args) {
        Test ob=new Test();
        ob.print();
    }
}
