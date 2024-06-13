import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AWT extends Frame implements ActionListener{
    TextField tf1,tf2;
    Label l1,l2,l3,l4;
    Button b1,b2;
    Image icon;
    AWT(){
        setVisible(true);
        setSize(1000,500);
        setLayout(null);
        setTitle("Calculator");
        icon = Toolkit.getDefaultToolkit().getImage("/home/user/Downloads/calc.jpeg");
        setIconImage(icon);
        l1 = new Label("Number1: ");
        l1.setBounds(100,100,150,30);
        tf1 = new TextField();
        tf1.setBounds(250,100,150,30);
        l2 = new Label("Number2: ");
        l2.setBounds(100,130,150,30);
        tf2 = new TextField();
        tf2.setBounds(250,130,150,30);
        b1 = new Button("Add");
        b1.setBounds(150,170,100,40);
        b2 = new Button("Sub");
        b2.setBounds(250,170,100,40);
        l3 = new Label("Result:");
        l3.setBounds(150,210,100,30);
        l4 = new Label();
        l4.setBounds(250,210,100,30);
        add(l1); 
        add(l2);
        add(l3);
        add(l4);
        add(b1);
        add(b2);
        add(tf1);
        add(tf2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e){
                System.out.println("Window Closed");
            }public void windowClosing(WindowEvent e){
                System.out.println("Window Closing");
                System.exit(0);
            }
        });
    }public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            l4.setText(String.valueOf(Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText())));
        }if(e.getSource()==b2){
            l4.setText(String.valueOf(Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText())));
        }return;
    }
}class SWINGS extends JFrame implements ActionListener{
    JTextField tf1,tf2;
    JLabel l1,l2,l3,l4;
    JButton b1,b2;
    Image icon;
    SWINGS(){
        setVisible(true);
        setSize(1000,500);
        setLayout(null);
        setTitle("Calculator");
        icon = Toolkit.getDefaultToolkit().getImage("/home/user/Downloads/calc.jpeg");
        setIconImage(icon);
        l1 = new JLabel("Number1: ");
        l1.setBounds(100,100,150,30);
        tf1 = new JTextField();
        tf1.setBounds(250,100,150,30);
        l2 = new JLabel("Number2: ");
        l2.setBounds(100,130,150,30);
        tf2 = new JTextField();
        tf2.setBounds(250,130,150,30);
        b1 = new JButton("Add");
        b1.setBounds(150,170,100,40);
        b2 = new JButton("Sub");
        b2.setBounds(250,170,100,40);
        l3 = new JLabel("Result:");
        l3.setBounds(150,210,100,30);
        l4 = new JLabel();
        l4.setBounds(250,210,100,30);
        add(l1); 
        add(l2);
        add(l3);
        add(l4);
        add(b1);
        add(b2);
        add(tf1);
        add(tf2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e){
                System.out.println("Window Closed");
            }public void windowClosing(WindowEvent e){
                System.out.println("Window Closing");
                System.exit(0);
            }
        });
    }public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            l4.setText(String.valueOf(Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText())));
        }if(e.getSource()==b2){
            l4.setText(String.valueOf(Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText())));
        }return;
    }
}
public class Calculator{
   public static void main(String[] args) {
    // AWT awt = new AWT();
    SWINGS swings = new SWINGS();
   }
}
