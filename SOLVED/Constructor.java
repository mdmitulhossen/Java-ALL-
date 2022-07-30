public class Constructor {
    Constructor(){
        System.out.println("Constructor");
    }
    Constructor(String s){
        System.out.println("Constructor overloading in " + s);
    }
    public static void main(String[] args) {
        Constructor ob=new Constructor();//by default call constructor
        Constructor ob1=new Constructor("Java");//constructor overloading
    }
}
