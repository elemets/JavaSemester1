import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class StopClock extends JFrame implements ActionListener
{
  private boolean isRunning = false;

  // The epoch unix time when the clock is started
  private long startTime = 0;

  private long stopTime =0;

  private long splitTime = 0;

  // JLabels + their instance variables

  JButton splitJButton;
  JButton startStopJButton;

  // A start time JLabel
  private final JLabel startTimeJLabel = new JLabel ("Not started");

  // A stop time JLabel
  private final JLabel stopTimeJLabel = new JLabel ("Not started");

  // elapsed time label
  private final JLabel elapsedTimeJLabel = new JLabel ("Not started");

  // split time JLabel
  private final JLabel splitTimeJLabel = new JLabel ("Not started");

  // Constructor Method
  public StopClock()
  {
    setTitle("Stop Clock");

    Container contents = getContentPane();
    // Grid Layout with one column
    contents.setLayout(new GridLayout(0, 1));

    // Adding all the starting JLabels

    contents.add(new JLabel ("Started at:"));
    contents.add(startTimeJLabel);

    contents.add(new JLabel ("Stopped at:"));
    contents.add(stopTimeJLabel);

    contents.add(new JLabel ("Elapsed time (seconds):"));
    contents.add(elapsedTimeJLabel);

    contents.add(new JLabel ("Split time (seconds):"));
    contents.add(splitTimeJLabel);

    startStopJButton = new JButton("Start / Stop");
    startStopJButton.addActionListener(this);
    contents.add(startStopJButton);

    // adding new Action Listener for split button
    splitJButton = new JButton("Split");
    splitJButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
          if (isRunning == true)
            {
              // Start Clock
              splitTime = System.currentTimeMillis() - startTime;
              splitTimeJLabel.setText("" + splitTime / 1000.0);

            }
            else
            {
              splitTimeJLabel.setText("You need to start it before you split!");
            }
          pack();
      }
    });
    contents.add(splitJButton);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  } // StopClock


  public void actionPerformed(ActionEvent startStopJButton)
  {
    if (!isRunning)
      {
        // Start Clock
        startTime = System.currentTimeMillis();
        startTimeJLabel.setText("" + startTime);
        stopTimeJLabel.setText("Running...");
        elapsedTimeJLabel.setText("Running...");
        isRunning = true;
      }
    else
    {
      // Stop clock and show updated times
      stopTime = System.currentTimeMillis();
      stopTimeJLabel.setText("" + stopTime);
      long elapsedMilliSeconds = stopTime - startTime;
      elapsedTimeJLabel.setText("" + elapsedMilliSeconds / 1000.0);
      isRunning = false;
    }
    pack();
  }

  // Main method
  public static void main(String[] args) {
    StopClock theStopClock = new StopClock();
    theStopClock.setVisible(true);
  }

}
