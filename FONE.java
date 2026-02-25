class Driver{
    void Drive(){
        System.out.println("F 1 Driver ");
        System.out.println("-----------------");
    }
}
class Redbull extends Driver{
    void red(){
        System.out.println("Red Bull  --- 1) Max Veratappan");
        System.out.println("Red Bull  --- 1) Isaac Hadjar");
        
    }
}
class Mercerdes extends Driver{
    void mer(){
        System.out.println("Mercerdes  --- 1) Geroge Russell");
        System.out.println("Mercerdes --- 2) Kini Antanollie");
        
    }
}
public class FONE{
    public static void main(String [] args){
        Redbull obj1 = new Redbull();
        obj1.Drive();
        obj1.red();
        Mercerdes obj2 = new Mercerdes();
        obj2.Drive();
        obj2.mer();

    }
}