import java.util.Scanner;

public class ShapeShift
{
    //A scanner to interact with the user
    private static Scanner inputScanner = new Scanner(System.in);


    // Helper method to read a point from the input
    private static Point inputPoint(String prompt)
    {
      System.out.print(prompt);
      double x = inputScanner.nextDouble();
      double y = inputScanner.nextDouble();
      return new Point (x, y);
    } // inputPoint

    // The X and Y to shift the first shape to get the second
    private static double xShift, yShift;

    //Helper Method to read X and Y
    private static void inputXYShifts()
    {
      System.out.print("Enter the offset as X Y: ");
      xShift = inputScanner.nextDouble();
      yShift = inputScanner.nextDouble();
    }

    // The main Method
    public static void main(String[] args) {
      //obtain shape choice
      System.out.print("Choose circle (1), triangle (2), rectangle (3): ");
      int shapeChoice = inputScanner.nextInt();

      // Process the shape based on choice.
      switch (shapeChoice)
      {
        // Circle
        case 1:
          Point centre = inputPoint("Enter the centre as X Y : ");
          System.out.print("Enter the radius: ");
          double radius = inputScanner.nextDouble();
          Circle originalCircle = new Circle(centre, radius);
          inputXYShifts();
          Circle shiftedCircle = originalCircle.shift(xShift, yShift);
          System.out.println();
          System.out.println(originalCircle);
          System.out.println("has area " + originalCircle.area() + ", perimeter "
          + originalCircle.perimeter());
          System.out.println("and when shifted by X offset " + xShift
          + " and Y offset " + yShift + ", gives");
          System.out.println(shiftedCircle);
          break;

        // Triangle
        case 2:
          Point pointA = inputPoint("Enter point A as X Y: ");
          Point pointB = inputPoint("Enter point B as X Y: ");
          Point pointC = inputPoint("Enter point C as X Y: ");
          Triangle originalTriangle = new Triangle(pointA, pointB, pointC);
          inputXYShifts();
          Triangle shiftedTriangle = originalTriangle.shift(xShift, yShift);
          System.out.println();
          System.out.println(originalTriangle);
          System.out.println("has area " + originalTriangle.area() + ", perimeter "
          + originalTriangle.perimeter());
          System.out.println("and when shifted by X offset " + xShift + " and Y offset " + yShift + ", gives");
          System.out.println(shiftedTriangle);
          break;

        // Rectangle
        case 3:
          Point diag1End1 = inputPoint("Enter one corner as X Y: ");
          Point diag1End2 = inputPoint("Enter opposite corner as X Y: ");
          Rectangle originalRectangle = new Rectangle(diag1End1, diag1End2);
          inputXYShifts();
          Rectangle shiftedRectangle = new Rectangle(diag1End1, diag1End2);
          System.out.println();
          System.out.println(originalRectangle);
          System.out.println("has area " + originalRectangle.area() + ", perimeter "
          + originalRectangle.perimeter());
          System.out.println("and when shifted by X offset " + xShift +
          " and Y offset " + yShift + ", gives");
          System.out.println(shiftedRectangle);
          break;

        // Bad choice
        default:
          System.out.println("That wasn't 1, 2 or 3!");
          break;
      }// Switch
    } // Main
}
