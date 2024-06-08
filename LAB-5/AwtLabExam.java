import java.awt.*;
import java.awt.event.*;
class AWT extends Frame implements ActionListener{
    Label  l;
    TextField tf;
    TextArea ta;
    Choice c;
    List li;
    Menu menu;
    MenuBar mb;
    MenuItem mi;
    CheckboxGroup cg;
    Checkbox cb;
    Button b;
    AWT(){
        setTitle("abc");
        setSize(1000,500);
        setVisible(true);
        setLayout(null);
        menu = new Menu("abc");
        mi = new MenuItem("abc");
        menu.add(mi);
        mb = new MenuBar();
        mb.add(menu);
        setMenuBar(mb);
        l = new Label("abc");
        l.setBounds(100,100,200,30);
        tf = new TextField("abc");
        tf.setBounds(100,130,200,30);
        c = new Choice();
        c.add("abc");
        c.setBounds(100,160,200,30);
        li = new List();
        li.add("abc");
        li.setBounds(100,190,200,30);
        cg = new CheckboxGroup();
        cb = new Checkbox("abc",true,cg);
        cb.setBounds(100,220,200,30);
        b = new Button("abc");
        b.setBounds(100,250,200,30);
        b.addActionListener(this);
        ta = new TextArea("abc",4,4);
        ta.setBounds(100,280,200,60);
        add(l);
        add(cb);
        add(c);
        add(li);
        add(b);
        add(tf);
        add(ta);
        addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e){
                System.out.println("Window closed");
            }public void windowClosing(WindowEvent e){
                System.out.println("Window closing");
                System.exit(0);
            }
        });addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse clicked");
            }
        });
    }public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            l.setText("xyz");
        }if(cb.getState()){
            l.setText("pqr");
        }
    }
}
public class AwtLabExam {
    public static void main(String[] args) {
        AWT awt = new AWT();
    }
}
