import java.lang.Math;
class Circle{
    float radius;
    float area;
    final float PI = (float) Math.PI;
    Circle(float r){
        this.radius =  r;
        this.area = radius*radius*this.PI;
    }
}class Cylinder extends Circle{
    float height;
    Cylinder(float radius, float height){
        super(radius);
        this.height = height;
    }float calcArea(){
        return 2*this.PI*this.radius*(this.radius+this.height);
    }float calcVolume(){
        return this.area*height;
    }
}class Rectangle{
    float length;
    float breadth;
    float area;
    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
}class Cuboid extends Rectangle{
    float height;
    Cuboid(float length, float breadth, float height){
        super(length, breadth);
        this.height = height;
    }float calcArea(){
        return 2*(this.length*this.breadth + this.height*this.breadth + this.length*this.height);
    }float calcVolume(){
        return this.length*this.breadth*this.height;
    }
}public class Geometry {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.calcArea());
        System.out.println(cylinder.calcVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.calcArea());
        System.out.println(cuboid.calcVolume());
    } 
}
