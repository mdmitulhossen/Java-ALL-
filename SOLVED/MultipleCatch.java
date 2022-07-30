public class MultipleCatch {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException err){
               System.out.println(err);
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println(err);
        }
    }
}
