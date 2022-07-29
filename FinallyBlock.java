public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println(10/2);
        }catch(ArithmeticException err){
               System.out.println(err);
        }finally{
            System.out.println (":: Finally Block::");
            System.out.println ("No Exception::finally block executed");
        }
    }
}
