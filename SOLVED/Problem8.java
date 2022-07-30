public class Problem8 {
    static int x=10;
    static void m1(){
        x=20;
    }
    static{
        System.out.println("Static Block.....(That run without main method)");
    }
    public static void main(String[] args) {
        //Don't create any object but i use veriable ,method
            System.out.println(x);
            m1();
            System.out.println(x);

    }
}
