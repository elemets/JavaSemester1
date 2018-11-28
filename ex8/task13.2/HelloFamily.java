import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class HelloFamily  extends JFrame
{
  // constructor
  public HelloFamily()
  {
    setTitle("Hello there family");
    Container contents = getContentPane();
    contents.setLayout(new FlowLayout());

    contents.add(new JLabel("Hello Pa!"));
    contents.add(new JLabel("Hello Gay!"));
    contents.add(new JLabel("Hello John!"));
    contents.add(new JLabel("Hello Georgie!"));
    contents.add(new JLabel("Hello Becca!"));
    contents.add(new JLabel("Hello Jack!"));
    contents.add(new JLabel("Hello GW!"));
    contents.add(new JLabel("Hello Paul!"));
    contents.add(new JLabel("Hello Becky!"));

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  } //Hello Fam

  public static void main(String[] args) {
    HelloFamily theHelloFamily = new HelloFamily();
    theHelloFamily.setVisible(true);
  }
}
