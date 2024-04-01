class OverLoading{
    void add(int a, int b){
        System.out.println(a+b);
    }void add(float a, float b){
        System.out.println(a+b);
    }
}public class MethodOverLoading {
    public static void main(String[] args) {
        OverLoading ol = new OverLoading();
        ol.add(1,2);
        ol.add(1.5f,0.5f);
    }
}
