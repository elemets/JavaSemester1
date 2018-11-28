import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloWorld extends JFrame
{
  public HelloWorld()
  {
    setTitle("Bonjour le Monde");
    Container contents = getContentPane();
    contents.add(new JLabel("Hàlo a Shaoghail"));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  }

  public static void main(String[] args) {
    HelloWorld theHelloWorld = new HelloWorld();
        HelloWorld the2HelloWorld = new HelloWorld();
    theHelloWorld.setVisible(true);
    the2HelloWorld.setVisible(true);
  }
}
