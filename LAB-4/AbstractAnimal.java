// abstract class Animal{
//     String echo;
//     Animal(String str){
//         this.echo = str;
//         System.out.println(echo);
//     }abstract void sounding();
// }class Human extends Animal{
//     Human(String str){
//         super(str);
//     }void sounding(){
//         System.out.println("Hai ra mowa..!");
//     }
// }public class AbstractAnimal {
//     public static void main(String[] args) {
//         Human obj = new Human("Hai ra mawa..!");
//         obj.sounding();
//     }
// }
abstract class Animal{
    Animal(String sound){
        System.out.println(sound);
    }public abstract void sounding(); 
}class Human extends Animal{
    String sound;
    Human(String sound){
        super(sound);
        this.sound = sound;
    }public void sounding(){
        System.out.println(this.sound);
    }
}public class AbstractAnimal{
    public static void main(String[] args){
        Human human = new Human("arey entra idhi?");
        human.sounding();
    }
}