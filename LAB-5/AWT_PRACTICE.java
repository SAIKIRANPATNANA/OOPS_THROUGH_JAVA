import java.awt.event.*;
import java.awt.*;
import java.lang.*;
class AWT extends Frame implements ActionListener{
    Label l1,l2,l3,l4,l5,l6;
    Button b1,b2,b3,b4;
    TextField t1,t2,t3,t4;
    TextArea ta;
    Choice c;
    CheckboxGroup cg1,cg2;
    Checkbox cb1,cb2,cb3,cb4;
    MenuBar mb;
    Menu menu,submenu;
    MenuItem i1,i2,i3,i4;
    AWT() {
        setTitle("AWT PRACTICE");
        setBackground(Color.green);
        setLayout(null);
        setSize(1000,500);
        setVisible(true);
        menu = new Menu("Menu");
        i1 = new MenuItem("i1");
        i2 = new MenuItem("i2");
        i3 = new MenuItem("i3");
        i4 = new MenuItem("i4");
        mb = new MenuBar();
        submenu = new Menu("Submenu");
        submenu.add(i3);
        submenu.add(i4);
        menu.add(i1);
        menu.add(i2);
        menu.add(submenu);
        mb.add(menu);
        setMenuBar(mb);
        l1 = new Label("REGISTRATION FORM");
        l1.setBounds(100,100,200,25);
        t1 = new TextField("Enter Name: ",50);
        t1.setBounds(100,130,200,30);
        t2 = new TextField("Enter Id: ", 25);
        t2.setBounds(100,160,200,30);
        l2 = new Label("Select Your Gender: ");
        l2.setBounds(100,190,200,30);
        cg1 = new CheckboxGroup();
        cb1 = new Checkbox("Male",true,cg1);
        cb1.setBounds(100,220,200,30);
        cb2 = new Checkbox("Female",true,cg1);
        cb2.setBounds(100,250,200,30);
        l3 = new Label("Select PUC Curriculum: ");
        l3.setBounds(100,280,200,30);
        cg2 = new CheckboxGroup();
        cb3 = new Checkbox("MBIPC",true,cg2);
        cb3.setBounds(100,310,200,30);
        cb4 = new Checkbox("MPC",true,cg2);
        cb4.setBounds(100,340,200,30);
        l4 = new Label("Select Your Branch: "); 
        l4.setBounds(100,370,200,30);
        c = new Choice();
        c.add("CSE");
        c.add("ECE");
        c.setBounds(100,400,200,30);
        l5 = new Label("Choose Your Campus: "); 
        l5.setBounds(100,430,200,30);
        List li = new List();
        li.add("Nuzvid");
        li.add("RKValley");
        li.setBounds(100,460,200,30);
        ta = new TextArea("Enter Abour Yourself: ",2,2);
        ta.setBounds(100,490,200,300);
        b1 = new Button("REGISTER");
        b1.setBounds(100,520,200,30);
        b2 = new Button("SUBMIT");
        b2.setBounds(100,550,200,30);
        t3 = new TextField("Enter number1: ");
        t3.setBounds(100,580,200,30);
        t4 = new TextField("Enter number2: ");
        t4.setBounds(100,610,200,30);
        b3 = new Button("Add"); 
        b3.setBounds(100,640,200,30);
        b4 = new Button("Sub");
        b4.setBounds(100,670,200,30);
        l6 = new Label();
        l6.setBounds(100,700,200,30);
        addWindowListener(new WindowAdapter(){
            public void windowOpened(WindowEvent e){
                System.out.println("Window opened");
            }public void windowClosing(WindowEvent e){
                System.out.println("Window Closing");
                System.exit(0);
            }
        });addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse Clicked");
                l6.setText(e.getX()+","+e.getY());
            }
        });
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(ta);
        add(c);
        add(li);
    }public void actionPerformed(ActionEvent e){
        if(e.getSource()==b3){
            l6.setText(String.valueOf(Integer.parseInt(t3.getText())+Integer.parseInt(t4.getText())));
        }if(e.getSource()==b4){
            l6.setText(String.valueOf(Integer.parseInt(t3.getText())-Integer.parseInt(t4.getText())));
        }if(e.getSource()==b2 && cb1.getState()){
            l6.setText("You are Mr. "+t1.getText());
        }if(e.getSource()==b2 && cb2.getState()){
            l6.setText("You are Mrs. "+t1.getText());
        }
    }
}public class AWT_PRACTICE {
    public static void main(String[] args) {
        AWT awt = new AWT();
    }
}