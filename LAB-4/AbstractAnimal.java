abstract class Animal{
    String echo;
    Animal(String str){
        this.echo = str;
        System.out.println(echo);
    }abstract void sounding();
}class Human extends Animal{
    Human(String str){
        super(str);
    }void sounding(){
        System.out.println("Hai ra mowa..!");
    }
}public class AbstractAnimal {
    public static void main(String[] args) {
        Human obj = new Human("Hai ra mawa..!");
        obj.sounding();
    }
}
