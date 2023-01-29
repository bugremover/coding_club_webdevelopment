import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
  private JTextField display;
  private double result;
  private String operator;
  private boolean start;
  
  public Calculator() {
    // Create the display
    display = new JTextField();
    display.setEditable(false);
    display.setHorizontalAlignment(JTextField.RIGHT);
    add(display, BorderLayout.NORTH);
    
    // Create the buttons
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 4));
    String[] buttons = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", ".", "0", "=", "/"};
    for (String button : buttons) {
      JButton b = new JButton(button);
      b.addActionListener(this);
      panel.add(b);
    }
    add(panel, BorderLayout.CENTER);
    
    // Set the frame properties
    setTitle("Calculator");
    setSize(500, 500);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
    if (command.matches("[0-9.]")) {
      if (start) {
        display.setText("");
        start = false;
      }
      display.setText(display.getText() + command);
    } else if (command.matches("[+\\-*/]")) {
      operator = command;
      result = Double.parseDouble(display.getText());
      start = true;
    } else if (command.equals("=")) {
      double value = Double.parseDouble(display.getText());
      if (operator.equals("+")) {
        result += value;
      } else if (operator.equals("-")) {
        result -= value;
      } else if (operator.equals("*")) {
        result *= value;
      } else if (operator.equals("/")) {
        result /= value;
      }
      display.setText(String.valueOf(result));
      start = true;
    }
  }
  
  public static void main(String[] args) {
    new Calculator();
  }
}
