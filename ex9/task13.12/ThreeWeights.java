import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.*;
import java.awt.Color;

public class ThreeWeights extends JFrame implements ActionListener
{

  // J Text Field
  private final JTextField weight1TextField =  new JTextField(3);

  private final JTextField weight2TextField =  new JTextField(3);

  private final JTextField weight3TextField =  new JTextField(3);

  // Constructor
  public ThreeWeights()
  {
    setTitle("Three Weights");

    Container contents = getContentPane();

    contents.setLayout(new GridLayout(0, 1));


    contents.add(new JLabel("Weight 1:"));
    contents.add(weight1TextField);

    contents.add(new JLabel("Weight 2:"));
    contents.add(weight2TextField);

    contents.add(new JLabel("Weight 3:"));
    contents.add(weight3TextField);

    calculateJbutton = new JButton ("Calculate!");
    calculateJbutton.addActionListener(this);
    contents.add(calculateJbutton);

  }

  public void actionPerformed(ActionEvent event){
    int weight1 = Integer.parseInt(weight1TextField.getText());
    int weight2 = Integer.parseInt(weight2TextField.getText());
    int weight3 = Integer.parseInt(weight3TextField.getText());

  }


  public static void main(String[] args) {
    ThreeWeights theThreeWeights = new ThreeWeights();
    theThreeWeights.setVisible(true);
  }



}
