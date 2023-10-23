
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class textareademo extends JFrame {
    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane s;
    textareademo(){
        initcomponanet();
    }
    public void initcomponanet(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        ta=new JTextArea();
        
        ta.setForeground(Color.green);
        ta.setBackground(Color.YELLOW);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        
        s=new JScrollPane(ta);
        s.setBounds(50, 100, 400, 200);
        c.add(s);
        
        
        f=new Font("arial",Font.BOLD,20);
        ta.setFont(f);
        
    
}
        
    public static void main(String[] args) {
        textareademo t=new textareademo();
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setBounds(50, 100, 500, 400);
        t.setTitle("text area");
        t.setBackground(Color.yellow);
        
    }
    
}
