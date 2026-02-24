class Animal{
    void eat(){
        System.out.println("Dog and Cat Are Eating");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println(" Dog Eating Royal Canin");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat Eating Whiskas");
    }
}
public class SingleInheritance{
    public static void main (String[]args){
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();

    }
}