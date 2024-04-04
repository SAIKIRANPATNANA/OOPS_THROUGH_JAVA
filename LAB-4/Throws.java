class ThrowsGame extends RuntimeException{
    static void Calc(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
}public class Throws {
    public static void main(String[] args) {
        ThrowsGame.Calc(1,0);
    }
}
