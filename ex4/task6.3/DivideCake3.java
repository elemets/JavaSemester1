public class DivideCake3
{
  public static void main(String[] args)
  {
   // parsing the ages as integers
   int age1 = Integer.parseInt(args[0]);
   int age2 = Integer.parseInt(args[1]);
   int age3 = Integer.parseInt(args[2]);

   // defining multiples for the calculations of the greatest common denominator
   int multipleOfGCD1 = age1;
   int multipleOfGCD2 = age2;
   int multipleOfGCD3 = age3;

   // working out greatest common denominator between age 1, 2
   while (multipleOfGCD1 != multipleOfGCD2)
     if (multipleOfGCD1 > multipleOfGCD2)
       multipleOfGCD1 -= multipleOfGCD2;
     else
     multipleOfGCD2 -= multipleOfGCD1;

    // working out greatest common denominator between age 1, 2 and 3
    while (multipleOfGCD1 != multipleOfGCD3)
      if (multipleOfGCD1 > multipleOfGCD3)
        multipleOfGCD1 -= multipleOfGCD3;
      else
      multipleOfGCD3 -= multipleOfGCD1;

    // defining number of portions for each person
    int noOfPortions1 = age1 / multipleOfGCD2;
    int noOfPortions2 = age2 / multipleOfGCD2;
    int noOfPortions3 = age3 / multipleOfGCD2;

    //printing the results
    System.out.println("The " + age1 + " year old gets " + noOfPortions1 +
                       " and the " + age2 + " year old gets " + noOfPortions2
                       + " and the " + age3 + " year old gets " + noOfPortions3);



  }
}
