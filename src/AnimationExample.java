import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationExample extends JPanel implements ActionListener {
  private int x;
  private Timer timer;

  public AnimationExample() {
    x = 0;
    timer = new Timer(50, this);
    timer.start();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.fillOval(x, 50, 50, 50);
  }

  public void actionPerformed(ActionEvent e) {
    x++;
    repaint();
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Animation Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.add(new AnimationExample());
    frame.setVisible(true);
  }
}
