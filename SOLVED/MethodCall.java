class CallByValue{
      int data = 50;
      void display(int data){
        data=data+100;
      }
}
class CallByReference{
      int data = 50;
      void display(CallByReference o){
        o.data=o.data+100;
      }
}

public class MethodCall {
    public static void main(String[] args) {
        //Call by value
        CallByValue ob1 = new CallByValue();
        System.out.println("Before change: "+ob1.data);
        ob1.display(500);
        System.out.println("After change: "+ob1.data);
        //Call by refernece
        CallByReference ob2 = new CallByReference();
        System.out.println("Before change: "+ob2.data);
        ob2.display(ob2);
        System.out.println("After change: "+ob2.data);
    }
}
