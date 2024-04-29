package MultiplePackages3;
import MultiplePackages1.MultiPackages1;
import MultiplePackages2.MultiPackages2;
public class MultiPackages3 {
   public static void main(String[] args) {
    MultiPackages1 m1 = new MultiPackages1();
    m1.hello();
    MultiPackages2 m2 = new MultiPackages2();
    m2.hello();
   }
}
