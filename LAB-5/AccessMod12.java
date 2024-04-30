package AccessModifiers1;
public class AccessMod12{
    public static void main(String[] args) {
        AccessMod1 am1 = new AccessMod1();
        System.out.println(am1.a);
        // System.out.println(am1.b); pvt
        System.out.println(am1.c);
        System.out.println(am1.d);
    }
}
