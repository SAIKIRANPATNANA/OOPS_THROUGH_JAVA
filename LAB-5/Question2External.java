import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class GUIApplication extends Frame{
    GUIApplication(){
        setTitle("Registration Form");
        setVisible(true);
        setSize(1000,500);
        setLayout(null);
        Label l1 = new Label("First Name");
        l1.setBounds(100,100,100,15);
        Label l2  = new Label("Last Name");
        l2.setBounds(300,100,100,15);
        TextField t1 = new TextField("Johnny");
        t1.setBounds(100,115,200,50);
        TextField t2 = new TextField("Nelson");
        t2.setBounds(300,115,200,50);
        Label l3 = new Label("Birthday");
        l3.setBounds(100,165,100,15);
        Label l4 = new Label("Gender");
        l4.setBounds(300,165,100,15);
        CheckboxGroup gender = new CheckboxGroup();
        TextField t3 = new TextField();
        t3.setBounds(100,180,200,50);
        Checkbox cb1 = new Checkbox("Male",true,gender);
        Checkbox cb2 = new Checkbox("Female",true,gender);
        cb1.setBounds(300,180,100,50);
        cb2.setBounds(400,180,100,50);
        Label l5 = new Label("Email");
        l5.setBounds(100,230,100,15);
        Label l6 = new Label("Phone Number");
        l6.setBounds(300,230,100,15);
        TextField t4 = new TextField();
        t4.setBounds(100,245,200,50);
        TextField t5 = new TextField();
        t5.setBounds(300,245,200,50);
        Label l7 = new Label("Subject");
        l7.setBounds(100,295,100,15);
        Choice c = new Choice();
        c.add("Choose Option");
        c.add("Maths");
        c.add("Java");
        c.setBounds(100,310,400,50);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(cb1);
        add(cb2);
        add(c);
    }
}
public class Question2External {
   public static void main(String[] args) {
    GUIApplication gui = new GUIApplication();
   }
}
