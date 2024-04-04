interface in1 {
    void display();
    void wish();
    int a = 10; //public static final initialized variables;
    int b = 10; //public abstract methods;
}interface in2 {
    void display();
    void wish();
    int a = 10; //public static final initialized variables;
    int b = 10; //public abstract methods;
}class in implements in1 {
    in(){
        System.out.println(in1.a);
        System.out.println(in1.b);
        System.out.println(in2.a);
        System.out.println(in2.b);
    }public void display(){
        System.out.println("hai");
    }public void wish(){
        System.out.println("hello");
    }
}public class Interfaces{
    public static void main(String[] args) {
        in obj = new in();
        obj.display();
        obj.wish();
    }
}