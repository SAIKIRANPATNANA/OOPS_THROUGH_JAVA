class Parent{
    void printStuff(){
        System.out.println("Stuff");
    }
}class Child extends Parent{
    final int a = 1;
    void printStuff(int k){
        System.out.println("Child");
    }
}public class FinalKeyword{
    public static void main(String[] args){
        Child child = new Child();
        child.printStuff(2);;
    }
}