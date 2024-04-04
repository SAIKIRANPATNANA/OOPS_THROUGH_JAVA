class A {
    int a = 1;
    void Aa(){
        System.out.println(a);
    }void Bb(){
        System.out.println(a);
    }
}class B extends A {
    int b = 2;
    void Bb(){
        System.out.println(b);
    }
}public class ObjectTypeCasting {
    public static void main(String[] args) {
        A obA = new A();
        B obB = new B();
        obA = obB;
        obB = (B) obA;
        obB.Aa();
        obB.Bb();
    }
}
