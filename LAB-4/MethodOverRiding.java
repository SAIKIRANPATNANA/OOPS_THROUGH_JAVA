class Arithmetic{
    void add(int a, int b){
        System.out.println(a+b);
    }
}class Add extends Arithmetic{
    int add(int a, float b, int c){
        System.out.println("After Adding: "+ (a+b+3));
        return a;
    }
}public class MethodOverRiding { 
    public static void main(String[] args) {
        Add obj = new Add();
        System.out.println(obj.add(1,2.5f,3));
    }
}
