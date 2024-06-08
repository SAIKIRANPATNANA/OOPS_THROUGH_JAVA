package MultiPkg2;
import MultiPkg1.AccessMod;
class AccessMod2 extends AccessMod{
    AccessMod2(){
        // System.out.println(a);
        // System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}public class MulitPkgAccessMod1Lab {
   public static void main(String[] args) {
        AccessMod am = new AccessMod();
        AccessMod2 am2 = new AccessMod2();
        // System.out.println(am.a);
        // System.out.println(am.b);
        // System.out.println(am.c);
        System.out.println(am.d);
   }
}
