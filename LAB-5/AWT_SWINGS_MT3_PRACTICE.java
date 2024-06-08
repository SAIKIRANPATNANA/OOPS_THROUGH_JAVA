import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AWT extends Frame implements ActionListener{
    Label l1;
    TextField t1,t2,t3;
    TextArea ta1;
    CheckboxGroup cg1;
    Checkbox cb1,cb2;
    TextArea ta;
    Choice c1;
    List li1;
    Button b1,b2;
    Menu menu,submenu;
    MenuItem i1,i2;
    MenuBar mb;
    AWT(){
        setTitle("AWT_MT3_PRACTICE");
        setVisible(true);
        setLayout(null);
        setSize(1000,500);
        setBackground(Color.blue);
        menu = new Menu("menu");
        submenu = new Menu("submenu");
        i1 = new MenuItem("i1");
        i2 = new MenuItem("i2");
        menu.add(i1);
        submenu.add(i2);
        menu.add(submenu);
        mb = new MenuBar();
        mb.add(menu);
        setMenuBar(mb);
        l1 = new Label("label");
        l1.setBounds(100,100,200,30);
        t1 = new TextField("enter name",15);
        t1.setBounds(100,130,200,30);
        t2 = new TextField("enter num1:",10);
        t2.setBounds(100,160,200,30);
        t3 = new TextField("enter num2:",10);
        t3.setBounds(100,190,200,30);
        cg1 = new CheckboxGroup();
        cb1 = new Checkbox("Male",true,cg1);
        cb1.setBounds(100,220,200,30);
        cb2 = new Checkbox("Female",false,cg1);
        cb2.setBounds(100,250,200,30);
        c1 = new Choice();
        c1.add("abc");
        c1.add("xyz");
        c1.setBounds(100,280,200,30);
        li1 = new List();
        li1.add("abc");
        li1.add("xyz");
        li1.setBounds(100,310,200,30);
        b1 = new Button("submit");
        b1.setBounds(100,340,200,30);
        b2 = new Button("add");
        b2.setBounds(100,370,200,30);
        ta1 = new TextArea("write something",2,2);
        ta1.setBounds(100,400,200,60);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowOpened(WindowEvent e){
                System.out.println("window opened");
            }public void windowClosing(WindowEvent e){
                System.out.println("window closing");
                System.exit(0);
            }public void windowClosed(WindowEvent e){
                System.out.println("window closed");
            }
        });
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                l1.setText(String.valueOf(e.getX()) + "," + String.valueOf(e.getY()));
            }
        });
        add(l1);
        add(t1);
        add(t2);
        add(t3);
        add(ta1);
        add(b1);
        add(b2);
        add(c1);
        add(li1);
        add(cb1);
        add(cb2);
    }public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            if(cb1.getState()){
                l1.setText("Mr. "+ t1.getText());
            }else if(cb2.getState()){
                l1.setText("Mrs. "+ t1.getText());
            }
        }if(e.getSource() == b2){
            l1.setText(String.valueOf(Integer.parseInt(t2.getText())+Integer.parseInt(t3.getText())));
        }
    }
}class SWINGS extends JFrame implements ActionListener{
    JLabel l1;
    JTextField t1,t2,t3;
    JTextArea ta1;
    JCheckBox cb1,cb2; //Box
    JRadioButton rb1,rb2;
    ButtonGroup bg1;
    JTextArea ta;
    // JChoice c1; ? not present in swings 
    // JList li1; ? not present in swings
    JButton b1,b2;
    JMenu menu,submenu;
    JMenuItem i1,i2;
    JMenuBar mb;
    SWINGS(){
        setTitle("AWT_MT3_PRACTICE");
        setVisible(true);
        setLayout(null);
        setSize(1000,500);
        setBackground(Color.blue);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu = new JMenu("menu");
        submenu = new JMenu("submenu");
        i1 = new JMenuItem("i1");
        i2 = new JMenuItem("i2");
        menu.add(i1);
        submenu.add(i2);
        menu.add(submenu);
        mb = new JMenuBar();
        mb.add(menu);
        setJMenuBar(mb);
        l1 = new JLabel("label");
        l1.setBounds(100,100,200,30);
        t1 = new JTextField("enter name",15);
        t1.setBounds(100,130,200,30);
        t2 = new JTextField("enter num1:",10);
        t2.setBounds(100,160,200,30);
        t3 = new JTextField("enter num2:",10);
        t3.setBounds(100,190,200,30);
        bg1 = new ButtonGroup();
        rb1 = new JRadioButton("Male");
        rb1.setBounds(100,220,200,30);
        rb2 = new JRadioButton("Female");
        rb2.setBounds(100,250,200,30);
        bg1.add(rb1);
        bg1.add(rb2);
        b1 = new JButton("submit");
        b1.setBounds(100,280,200,30);
        b2 = new JButton("add");
        b2.setBounds(100,310,200,30);
        ta1 = new JTextArea("write something",2,2);
        ta1.setBounds(100,340,200,60);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowOpened(WindowEvent e){
                System.out.println("window opened");
            }public void windowClosing(WindowEvent e){
                System.out.println("window closing");
                System.exit(0);
            }public void windowClosed(WindowEvent e){
                System.out.println("window closed");
            }
        });
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                l1.setText(String.valueOf(e.getX()) + "," + String.valueOf(e.getY()));
            }
        });
        add(l1);
        add(t1);
        add(t2);
        add(t3);
        add(ta1);
        add(b1);
        add(b2);
        add(rb1);
        add(rb2);
    }public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            if(rb1.isSelected()){
                l1.setText("Mr. "+ t1.getText());
            }else if(rb2.isSelected()){
                l1.setText("Mrs. "+ t1.getText());
            }
        }if(e.getSource() == b2){
            l1.setText(String.valueOf(Integer.parseInt(t2.getText())+Integer.parseInt(t3.getText())));
        }
    }
}public class AWT_SWINGS_MT3_PRACTICE {
   public static void main(String[] args) {
        // AWT awt = new AWT();
        SWINGS swings = new SWINGS();
   } 
}
