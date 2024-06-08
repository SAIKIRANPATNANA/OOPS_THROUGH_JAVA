import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
class Window1 implements WindowListener{
    public void windowActivated(WindowEvent w){
        System.out.println("Window Activated");
    }public void windowDeactivated(WindowEvent w){
        System.out.println("Window Deactivated");
    }public void windowClosed(WindowEvent w){
        System.out.println("Window Closed");
    }public void windowOpened(WindowEvent w){
        System.out.println("Window Opened");
    }public void windowIconified(WindowEvent w){
        System.out.println("Window Iconified");
    }public void windowDeiconified(WindowEvent w){
        System.out.println("Window Deiconified");
    }public void windowClosing(WindowEvent w){
        System.out.println("Window Closing");
        System.exit(0);
    }
}class ExtendedAWT extends Frame{
    ExtendedAWT(){
        setTitle("AWT PRACTICE");
        setVisible(true);
        setSize(1000,500);
        setBackground(Color.blue);
        setLayout(null);
        setForeground(Color.red);
        addWindowListener(new WindowAdapter(){
            public void windowActivated(WindowEvent w){
                System.out.println("Window Activated");
            }public void windowDeactivated(WindowEvent w){
                System.out.println("Window Deactivated");
            }public void windowClosed(WindowEvent w){
                System.out.println("Window Closed");
            }public void windowOpened(WindowEvent w){
                System.out.println("Window Opened");
            }public void windowIconified(WindowEvent w){
                System.out.println("Window Iconified");
            }public void windowDeiconified(WindowEvent w){
                System.out.println("Window Deiconified");
            }public void windowClosing(WindowEvent w){
                System.out.println("Window Closing");
                System.exit(0);
            }
        });
        MenuBar menu_bar = new MenuBar();
        Menu menu = new Menu("Menu");
        Menu submenu = new Menu("Submenu");
        MenuItem i1 = new MenuItem("item1");
        MenuItem i2 = new MenuItem("item2");
        MenuItem i3 = new MenuItem("item3");
        MenuItem i4 = new MenuItem("item4");
        menu.add(i1);
        menu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        menu.add(submenu);
        menu_bar.add(menu);
        setMenuBar(menu_bar);
        Label l1 = new Label("REGISTRATION FORM");
        l1.setBounds(400, 50, 300, 20);
        l1.setAlignment(Label.CENTER);
        add(l1);
        Button b1 = new Button("REGISTER");
        b1.setBackground(Color.red);
        b1.setBounds(450, 100, 100, 30);
        add(b1);
        Button b2 = new Button("SUBMIT");
        b2.setBackground(Color.black);
        b2.setBounds(550, 100, 100, 30);
        add(b2);
        TextField t1 = new TextField("Enter Name: ",50);
        TextField t2 = new TextField("Enter ID: ",6);
        TextField t3 = new TextField("Enter SMS Password: ");
        t3.setEchoChar('*');
        t1.setBounds(300, 150, 400, 20);
        t2.setBounds(300, 180, 400, 20);
        t3.setBounds(300, 210, 400, 20);
        add(t1);
        add(t2);
        add(t3);
        TextArea ta1 = new TextArea("Enter About Yourself: ",100,50);
        ta1.setBounds(300, 240, 400, 100);
        add(ta1);
        Label l4 = new Label("Select Your Dept: ");
        l4.setBounds(300, 350, 150, 20);
        add(l4);
        Choice  c = new Choice();
        c.add("CSE");
        c.add("ECE");
        c.setBounds(450, 350, 150, 20);
        add(c);
        Label l5 = new Label("Select Your Gender: ");
        l5.setAlignment(Label.RIGHT);
        l5.setBounds(300,400,150,20);
        add(l5);
        List li  = new List();
        li.add("MALE");
        li.add("FEMALE");
        li.add("TRANS");
        li.setBounds(450, 380, 100, 50);
        add(li);
        Checkbox ch1 = new Checkbox("DISABLED");
        Checkbox ch2 = new Checkbox("ABLED");
        ch1.setBounds(300, 450, 100, 20);
        ch2.setBounds(450, 450, 100, 20);
        add(ch1);
        add(ch2);
        CheckboxGroup Group = new CheckboxGroup();
        Checkbox cbg1 = new Checkbox("MBIPC",true,Group);
        Checkbox cbg2 = new Checkbox("NON MBIPC",true,Group);
        cbg1.setBounds(300, 480, 100, 20);
        cbg2.setBounds(450, 480, 100, 20);
        add(cbg1);
        add(cbg2);
        Scrollbar  sb = new Scrollbar();
        sb.setBounds(900, 100, 20, 300);
        add(sb);
    }
}class ExtendedSWINGS extends JFrame implements ActionListener,MouseListener{
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JLabel jl4;
    JTextField jt1;
    JTextField jt2;
    JTextField jt3;
    JTextField jt4;
    JTextArea jta;
    JButton jb1;
    JButton jb2;
    JButton jb3; 
    JButton jb4;
    JCheckBox jcb1;
    JCheckBox jcb2;
    JRadioButton jr1;
    JRadioButton jr2;
    JRadioButton jr3;
    // JComboBox jcb;
    ExtendedSWINGS(){
        setTitle("SWINGS PRACTICE");
        setVisible(true);
        setSize(1000,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.green);
        jl1 = new JLabel("REGISTRATION FORM");
        jt1 = new JTextField("Enter Name: ",50);
        jt2 = new JTextField("Enter ID: ",7);
        jt3 = new JTextField(25);
        jt4 = new JTextField(25);
        jb3 = new JButton("Add");
        jb4 = new JButton("Sub");
        jta = new JTextArea("Enter About Yourself: ", 15,10);
        jb1 = new JButton("Register");
        jcb1 = new JCheckBox("Disabled");
        jcb2 = new JCheckBox("Abled");
        jr1 = new JRadioButton("Male");
        jr2 = new JRadioButton("Female");
        jr3 = new JRadioButton("Transgender");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);
        // jcb = new JComboBox();
        // jcb.addItem("CSE");
        // jcb.addItem("ECE");
        jb2 = new JButton("Submit");
        jl2 = new JLabel();
        jl3 = new JLabel();
        jl4 = new JLabel();
        addMouseListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        add(jl1);
        add(jl2);
        add(jt1);
        add(jt2);
        add(jta);
        add(jb1);
        add(jb2);
        add(jr1);
        add(jr2);
        add(jr3);
        add(jcb1);
        add(jcb2);
        add(jt3);
        add(jt4);
        add(jb3);
        add(jb4);
        add(jl3);
        add(jl4);
        // add(jcb);
    }public void actionPerformed(ActionEvent e){
        System.out.println("Action Performed");
        int num1 = Integer.parseInt(jt3.getText());
        int num2 = Integer.parseInt(jt4.getText());
        if(e.getSource()==jb3){
            jl3.setText(String.valueOf(num1+num2));
        }else{
            jl3.setText(String.valueOf(num1-num2));
        }if(jr1.isSelected()){
            jl2.setText("You are Mr. "+jt1.getText());
        }else if(jr2.isSelected()){
            jl2.setText("You are Mrs. "+jt1.getText());
        }else {
            jl2.setText("You are Mr/Mrs. "+jt1.getText());
        }// System.out.println(jcb.getSelectedItem());
    }public void mousePressed(MouseEvent e){
        System.out.println("Mouse Pressed");
        jl4.setText(e.getX()+","+e.getY());
    }public void mouseExited(MouseEvent e){
        System.out.println("Mouse Exited");
    }public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered");
    }public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released");
    }public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked");
    }
}public class AWT_SWINGS{
    public static void main(String[] args) {
        // Frame f = new Frame();
        // f.setTitle("AWT PRACTICE");
        // f.setVisible(true);
        // f.setSize(400,300);
        // f.setBackground(Color.green);
        // f.setForeground(Color.red);
        // ExtendedAWT eawt = new ExtendedAWT();
        ExtendedSWINGS swings = new ExtendedSWINGS();
    }
}
