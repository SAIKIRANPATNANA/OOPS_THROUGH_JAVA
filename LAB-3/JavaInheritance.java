class GrandParent{
    int a = 1;
    void grand_parent_method(){
        System.out.println("Grand Parent Method");
    }
}class Parent extends GrandParent{
    int b = 2;
    void parent_method(){
        System.out.println("Parent Method");
    }
}class Child1 extends Parent{
    int c = 3;
    void child_method1(){
        System.out.println("Child Method1");
    }
}class Child2 extends Parent{
    int c = 4;
    void child_method2(){
        System.out.println("Child Method2");
    }
}class GrandChild extends Child1{
    int d = 5;
    void grand_child_method(){
        System.out.println("Grand Child Method");
    }
}public class JavaInheritance{
    public static void main(String[] args){
        GrandChild obj = new GrandChild();
        System.out.println(obj.a);
        obj.grand_parent_method();
        System.out.println(obj.b);
        obj.parent_method();
        System.out.println(obj.c);
        obj.child_method1();
        Child2 obj1 = new Child2();
        System.out.println(obj1.c);
        obj1.child_method2();
        System.out.println(obj.d);
        obj.grand_child_method();
        

    }
}