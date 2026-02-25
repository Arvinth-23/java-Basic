class Driver {
    void drive() {
        System.out.println("Driver is ready to race.");
    }
}
class F1Driver extends Driver {
    void category() {
        System.out.println("Category: Formula 1");
    }
}
class RedBullDriver extends F1Driver {
    void team() {
        System.out.println("Team: Red Bull");
    }
}
public class WorkAtTech {
    public static void main(String[] args) {
        RedBullDriver obj = new RedBullDriver();
        obj.drive();     
        obj.category(); 
        obj.team();   
    }
}