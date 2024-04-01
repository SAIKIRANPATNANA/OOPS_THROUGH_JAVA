abstract class Bike {
    String name;
    int capacity;
    int millage;
    Bike(String name, int capacity, int millage){
        this.name = name; 
        this.capacity = capacity;
        this.millage = millage;
    }abstract void display();
}class Honda extends Bike{
    Honda(String name, int capacity, int millage){
        super(name, capacity, millage);
    }void display(){
        System.out.println("Name: " + name+" capacity: " + capacity+ " millage: " + millage);
    }
}public class AbstractBike{
    public static void main(String[] args) {
        Honda bike = new Honda("Maruthi",6,100);
        bike.display();
    }
}
