import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import frame.Color;



public class main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

JButton b=new JButton("fuck you");
b.setBounds(120,120,30,40);
JButton c=new JButton("harsha");
c.setBounds(125,125,100,100);
b.setForeground(Color.black);
frame.add(b);
frame.add(c);
        frame.setTitle("harsha");
        frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
        ImageIcon image=new ImageIcon("C:\\Users\\harsha\\Pictures\\654249.png");
        frame.setIconImage(image.getImage());
        //frame.getContentPane().setForeground(new Color());//rbg values (0,0,0)=black (255,255,255)=white
    }
    
}
