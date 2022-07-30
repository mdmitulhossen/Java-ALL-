//If statement
class If{
    int x=10;
    void display(){
        if(x>18){
            System.out.println("Age is greater then 18");
        }
        else{
            System.out.println("Age is less then 18");
        }
    }
}
//switch statement
class Switch{
    int x=20;
    void display(){
        switch (x) {
            case 10:
                System.out.println("Number is 10");
                break;
            case 20:
                System.out.println("Number is 20");
                break;
            case 30:
                System.out.println("Number is 30");
                break;
        
            default:
                System.out.println("Number not in 10,20 or 30");
                break;
        }
    }
}
//for loop
class For{
    void display(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
//while loop
class While{
    int i=1;
    void display(){
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}
//do-while loop
class Do{
    int i=1;
    void display(){
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}


public class Problem3 {
    public static void main(String[] args) {
        If obj1= new If();
        Switch obj2=new Switch();
        For obj3=new For();
        While obj4 = new While();
        Do obj5 = new Do();

        //if 
        System.out.println("");
        System.out.println("If statement::......");
        obj1.display();
        //Switch
        System.out.println("");
        System.out.println("Switch statement::......");
        obj2.display();
        //For 
        System.out.println("");
        System.out.println("For Loop::......");
        obj3.display();
        //while
        System.out.println("");
        System.out.println("While Loop::......");
        obj4.display();
        //Do-while
        System.out.println("");
        System.out.println("Do-while Loop::......");
        obj5.display();
    }
}
