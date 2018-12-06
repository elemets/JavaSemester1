import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;


public class StopClock extends JFrame
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
  private final JTextField startTimeTextField = new JTextField ("Not started");

  // A stop time JLabel
  private final JTextField stopTimeTextField = new JTextField ("Not started");

  // elapsed time label
  private final JTextField elapsedTimeTextField = new JTextField ("Not started");

  // split time JLabel
  private final JTextField splitTimeTextField = new JTextField ("Not started");

  // Constructor Method
  public StopClock()
  {
    setTitle("Stop Clock");

    Container contents = getContentPane();
    // Grid Layout with one column
    contents.setLayout(new GridLayout(0, 1));

    // Adding all the starting JLabels

    contents.add(new JLabel ("Started at:"));
    contents.add(startTimeTextField);
    startTimeTextField.setEnabled(false);
    startTimeTextField.setBackground(Color.black);

    contents.add(new JLabel ("Stopped at:"));
    contents.add(stopTimeTextField);
    stopTimeTextField.setEnabled(false);
    stopTimeTextField.setBackground(Color.black);

    contents.add(new JLabel ("Elapsed time (seconds):"));
    contents.add(elapsedTimeTextField);
    elapsedTimeTextField.setEnabled(false);
    elapsedTimeTextField.setBackground(Color.black);

    contents.add(new JLabel ("Split time (seconds):"));
    contents.add(splitTimeTextField);
    splitTimeTextField.setEnabled(false);
    splitTimeTextField.setBackground(Color.black);

    startStopJButton = new JButton("Start");
    startStopJButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event)
      {
        if (!isRunning)
          {
            splitJButton.setEnabled(true);
            // Start Clock
            startTime = System.currentTimeMillis();
            startTimeTextField.setText("" + startTime);
            stopTimeTextField.setText("Running...");
            elapsedTimeTextField.setText("Running...");
            isRunning = true;
            startStopJButton.setText("Stop");
          }
        else
        {

          // Stop clock and show updated times
          stopTime = System.currentTimeMillis();
          stopTimeTextField.setText("" + stopTime);
          long elapsedMilliSeconds = stopTime - startTime;
          elapsedTimeTextField.setText("" + elapsedMilliSeconds / 1000.0);
          startStopJButton.setText("Start");
          isRunning = false;
          splitJButton.setEnabled(false);
        }
        pack();
      }
    });
    contents.add(startStopJButton);

    // adding new Action Listener for split button
    splitJButton = new JButton("Split");
    splitJButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
          if (isRunning == true)
            {
              // Start Clock
              splitTime = System.currentTimeMillis() - startTime;
              splitTimeTextField.setText("" + splitTime / 1000.0);
              splitJButton.setEnabled(true);
            }
            else
            {
              splitJButton.setEnabled(false);
            }
          pack();
      }
    });
    contents.add(splitJButton);
    splitJButton.setEnabled(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  } // StopClock


  // Main method
  public static void main(String[] args) {
    StopClock theStopClock = new StopClock();
    theStopClock.setVisible(true);
  }

}
