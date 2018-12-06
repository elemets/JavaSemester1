import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GCD extends JFrame implements ActionListener
{
  // A JTextField for each number
  private final JTextField number1JTextField = new JTextField(20);
  private final JTextField number2JTextField = new JTextField(20);
  private final JTextField number3JTextField = new JTextField(20);

  // A JTextField for the result
  private final JTextField resultJTextField = new JTextField(20);

  public GCD()
  {
    setTitle("GCD");

    Container contents = getContentPane();
    contents.setLayout(new GridLayout(0, 1));

    // Adding the number input fields
    contents.add(new JLabel("Number 1"));
    contents.add(number1JTextField);
    contents.add(new JLabel("Number 2"));
    contents.add(number2JTextField);
    contents.add(new JLabel("Number 3"));
    contents.add(number3JTextField);

    // Adding JButton
    JButton computeJButton = new JButton("Compute");
    contents.add(computeJButton);
    computeJButton.addActionListener(this);

    contents.add(new JLabel("GCD of the three numbers"));
    contents.add(resultJTextField);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
    }


    // Action to do when button pressed
    public void actionPerformed(ActionEvent event)
    {
      int number1 = Integer.parseInt(number1JTextField.getText());
      int number2 = Integer.parseInt(number2JTextField.getText());
      int number3 = Integer.parseInt(number3JTextField.getText());
      int GCDof2No = MyMath.greatestCommonDivisor(number1, number2);
      int GCD = MyMath.greatestCommonDivisor(GCDof2No, number3);

      resultJTextField.setText("" + GCD);

    }

    // Create a GCD and make it appear on screen
    public static void main(String[] args) {
      GCD theGCD = new GCD();
      theGCD.setVisible(true);
    } // main
}
