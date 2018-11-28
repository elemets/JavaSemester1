import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class TimesTable extends JFrame
  {

    private int multiple1;
    private int multiple2;


    public TimesTable(int firstMultiple1, int secondMultiple1)
    {

      multiple1 = firstMultiple1;
      multiple2 = secondMultiple1;

      setTitle("Times Table");
      Container contents = getContentPane();
      contents.setLayout(new GridLayout(0, 5, 20, 10));

        for (int column = 1; column < multiple2; column++)
        {
          contents.add(new JLabel(column + ""));
          contents.add(new JLabel("X"));
          contents.add(new JLabel(multiple2 + ""));
          contents.add(new JLabel("="));
          contents.add(new JLabel("" + column * multiple2));
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }


  public static void main(String[] args)
  {
    int firstMultiple = Integer.parseInt(args[0]);
    int secondMultiple = Integer.parseInt(args[1]);

    TimesTable theTimesTable = new TimesTable(firstMultiple, secondMultiple);
    theTimesTable.setVisible(true);

  }
}
