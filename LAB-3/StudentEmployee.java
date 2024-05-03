class Person{
    String name;
    String email;
    String address;
    long phoneNumber;
}class Student extends Person{
    static String status;
    Student(String name){
        this.name = name;
    }Student(String name, String email, String address, long phoneNumber){
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }public String toString(){
        System.out.println("Student");
        return name;
    }
}class Employee extends Person{
    String office;
    String date;
    float salary;
    public String toString(){
        System.out.println("Person");
        return name;
    }
}class Faculty extends Employee{
    int office_hrs;
    String rank;
    public String toString(){
        System.out.println("Faculty");
        return name;
    }
}class Staff extends Employee{
    String title;
    public String toString(){
        System.out.println("Staff");
        return name;
    }
}public class StudentEmployee{
    public static void main(String[] args){
        Student obj = new Student("saikiran");
        System.out.println(obj.toString());
    }
}