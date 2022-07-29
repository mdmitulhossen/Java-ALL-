public class MethodOverloading {
    void sum(int x,int y){
        System.out.println("Sum = "+(x+y));
    }
    void sum(int x,int y,int z){
        System.out.println("Sum = "+(x+y+z));
    }
    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
        ob.sum(10,30);
        ob.sum(10,20,30);//over loading sum method
    }
}
