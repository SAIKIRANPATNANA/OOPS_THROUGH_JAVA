package AccessModifiers2;
import AccessModifiers1.AccessMod1;
public class AccessMod22 extends AccessMod1{
    public static void main(String[] args) {
        AccessMod22 am22 = new AccessMod22();
        // System.out.println(am22.a);
        // System.out.println(am22.b); pvt
        System.out.println(am22.c);
        System.out.println(am22.d);
    }
}
