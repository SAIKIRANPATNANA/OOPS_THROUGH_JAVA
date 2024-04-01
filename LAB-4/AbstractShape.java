abstract class Shape{
    abstract float perimeter(float r);
    abstract float perimeter(float l, float b);
    abstract float area(float r);
    abstract float area(float l, float b);
}class Rectangle extends Shape{
    float perimeter(float l, float b){
        return 2*(l+b);
    }float area(float l, float b){
        return l*b;
    }float perimeter(float l){
        return 4*l;
    }float area(float l){
        return l*l;
    }
}class Circle extends Shape{
    float perimeter(float r){
        return 2*(float)Math.PI*r;
    }float area(float r){
        return (float)Math.PI*r*r;
    }float perimeter(float l, float b){
        return 2*(l+b);
    }float area(float l, float b){
        return l*b;
    }
}public class AbstractShape{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect.area(1,2));
        System.out.println(rect.perimeter(1,2));
        Circle circ = new Circle();
        System.out.println(circ.area(1));
        System.out.println(circ.perimeter(1));

    }
}
