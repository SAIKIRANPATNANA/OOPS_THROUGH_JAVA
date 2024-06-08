package MultiPkg1;
public class AccessMod{
    int a = 1;
    private int b = 2;
    protected int c = 3;
    public int d = 4;
    public AccessMod(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}class AccessMod1 extends AccessMod{
    AccessMod1(){
        System.out.println(a);
        // System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
// public class MultiPkgAccessModLab extends AccessMod{
//     public static void main(String[] args) {
//         AccessMod am = new AccessMod();
//         AccessMod1 am1 = new AccessMod1();
//         System.out.println(am.a);
//         // System.out.println(am.b);
//         System.out.println(am.c);
//         System.out.println(am.d);
//     }
// }
