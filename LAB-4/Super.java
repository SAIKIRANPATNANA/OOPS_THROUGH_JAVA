class SuperParent{
    int a;
    SuperParent(){
        System.out.println("Super ra..!");
    }SuperParent(int a){
        System.out.println(a);
    }void display(String str){
        System.out.println(str);
    }
}class SuperChild extends SuperParent{
    SuperChild(int a){
       super();
       super.a = a;
    }SuperChild(){
        super(1);
    }void Display(String str){
        super.display(str);
    }
}public class Super {
    public static void main(String[] args) {
        SuperChild obj = new SuperChild(1); 
        SuperChild obj1 = new SuperChild();
        obj.Display("yeah");
        obj1.Display("yes");
    }
}
