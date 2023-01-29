import java.awt.*;
import javax.swing.*;

public class IronMan extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillRoundRect(50, 50, 100, 150, 20, 20);
    g.setColor(Color.BLACK);
    g.fillRoundRect(70, 120, 60, 50, 20, 20);
    g.setColor(Color.YELLOW);
    g.fillOval(90, 140, 20, 20);
    g.fillArc(70, 70, 60, 80, 0, 180);
    g.setColor(Color.BLACK);
    g.drawLine(70, 130, 130, 130);
    g.drawLine(100, 50, 100, 130);
    g.drawLine(70, 100, 130, 100);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Iron Man");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 250);
    frame.add(new IronMan());
    frame.setVisible(true);
  }
}
