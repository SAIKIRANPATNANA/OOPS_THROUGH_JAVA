class EncapsulationStuff{
    private int a;
    private int b;
    void setA(int a){
        this.a = a;
    }void setB(int b){
        this.b = b;
    }int getA(){
        return this.a;
    }int getB(){
        return this.b;
    }
}public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationStuff obj = new EncapsulationStuff();
        obj.setA(1);
        obj.setB(2);
        System.out.println(obj.getA());
        System.out.println(obj.getB());
    }
}
