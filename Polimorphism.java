
class Shape{  
    void draw(){System.out.println("drawing...");}  
    void earse(){System.out.println("Earsing...");}  
    }  
    class Rectangle extends Shape{  
    void draw(){System.out.println("drawing rectangle...");} 
    void earse(){System.out.println("Earsing rectangle...");} 
    }  
    class Circle extends Shape{  
    void draw(){System.out.println("drawing circle...");}
    void earse(){System.out.println("Earsing circle...");}  
    }  
    class Triangle extends Shape{  
    void draw(){System.out.println("drawing triangle...");}  
    void earse(){System.out.println("Earsing triangle...");}
    }  
  public class Polimorphism{  
    public static void main(String args[]){  
    Shape s;  
    s=new Rectangle();  
    s.draw(); 
    s.earse(); 
    s=new Circle();  
    s.draw();  
    s.earse();
    s=new Triangle();  
    s.draw();  
    s.earse();
    }  
    }  