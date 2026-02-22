import java.util.Scanner;
class Circle {
    double radius;
        Circle(double radius){
            this.radius = radius;
        }
        double area(){
            return 3.14 * radius * radius;
        }
    
}
class Rectangle {
    double length,breadth;
        Rectangle(double length, double breadth){
            this.length = length;
            this.breadth = breadth;
        }
        double area(){
            return length * breadth;
        }
}
 class Square{
    double side;
    Square(double side){
        this.side = side;
    }
    double area(){
        return side * side ;
    }
 }     
public class Area{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("Area of circle:"+c.area());
        
        System.out.println("Enter the length and breadth:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Rectangle r = new Rectangle(length, breadth);
        System.out.println("Area of Rectangle:"+r.area());

        System.out.println("Enter the side of the square:");
        double side = sc.nextDouble();
        Square s = new Square(side);
        System.out.println("Area of square:"+s.area());
    }
}   
