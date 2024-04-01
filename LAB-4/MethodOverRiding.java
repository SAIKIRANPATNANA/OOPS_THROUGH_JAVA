class Arithmetic{
    void add(int a, int b){
        System.out.println(a+b);
    }
}class Add extends Arithmetic{
    void add(int a, float b){
        System.out.println("After Adding: "+ (a+b));
    }
}public class MethodOverRiding { 
    public static void main(String[] args) {
        Add obj = new Add();
        obj.add(1,2.5f);
    }
}
