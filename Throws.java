public class Throws {
    void m1() throws Exception{
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        Throws ob = new Throws();
        try{
            ob.m1();
        }catch(Exception err){
            System.out.println(err);
        }
    }
}
