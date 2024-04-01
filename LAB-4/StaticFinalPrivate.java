class Checking{
    static int a = 10;
    // private int b = 10;
    final int c = 10;
}
public class StaticFinalPrivate {
    public static void main(String[] args) {
        Checking check = new Checking();
        Checking.a = 20;
        System.out.println(Checking.a);
        System.out.println(check.c);
    }
}
