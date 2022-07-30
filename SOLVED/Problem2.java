//incrememt-decrement
class IncreDecre{
    int x=5;
    int y=6;
    int a=x++;
    int b=y--;
    void display(){
        System.out.println("Original value X = "+this.a);
        System.out.println("After Increment value X = "+this.x);
        System.out.println("Original value Y = "+this.b);
        System.out.println("After decrement value y = "+this.y);
    }
}
//Arithmetic
class Arithmetic{
    int x=10;
    int y=5;
    void display(){
        System.out.println(x + " + " + y + " = " +(this.x+this.y));
        System.out.println(x + " - " + y + " = " +(this.x-this.y));
        System.out.println(x + " * " + y + " = " +(this.x*this.y));
        System.out.println(x + " / " + y + " = " +(this.x/this.y));
        System.out.println(x + " % " + y + " = " +(this.x%this.y));
    }
}
//relaional operator
class Relation{
    int x=10;
    int y=5;
    void display(){
        if(x<y){
            System.out.println(x + " is less then " + y);//also use <=
        }
        else if(x>y){
            System.out.println(x + " is greater then " + y);//also use >=
        }
    }
}

//bitwise
class Bitwise{
    int x=10;
    int y=11;
    void display(){
        
            System.out.println(x + " & " + y + " = "+(x&y));
            System.out.println(x + " | " + y + " = "+(x|y));
            System.out.println(x + " ^ " + y + " = "+(x^y));
        
    }
}
//Conditional
class Conditional{
    int x=10;
    int y=11;
    void display(){
            int min = (x<y)?x:y;
            System.out.println("Minimum number = " + min);
    }
}


public class Problem2 {
    public static void main(String[] args) {
        IncreDecre obj1 = new IncreDecre();
        Arithmetic obj2 = new Arithmetic();
        Relation obj3 = new Relation();
        Bitwise obj4 = new Bitwise();
        Conditional obj5 = new Conditional();
         //Increment Decrement
       obj1.display();
       //arithmetic
       System.out.println("");
       System.out.println("Arithmetic Oparetor:: ......");
        obj2.display();
       //relational
       System.out.println("");
       System.out.println("Relation Oparetor:: ......");
       obj3.display();
       //bitwise
       System.out.println("");
       System.out.println("bitwise Oparetor:: .......");
       obj4.display();
       //bitwise
       System.out.println("");
       System.out.println("Conditional Oparetor:: .......");
       obj5.display();
    }
}
