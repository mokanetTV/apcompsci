import java.util.Scanner;

/**
 * Receipt4.java
 *
 * @author - Kiwi
 * @author - BM7
 *
 */
public class Receipt4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      //School name and Initials
      System.out.print("Enter the full high school name (4 words): ");
      String fullName = input.nextLine();

      // first word
      int space1 = fullName.indexOf(" ");
      String initials = fullName.substring(0, 1);

      // second word
      String rest = fullName.substring(space1 + 1);
      int space2 = rest.indexOf(" ");
      initials += rest.substring(0, 1);

      // third word
      rest = rest.substring(space2 + 1);
      int space3 = rest.indexOf(" ");
      initials += rest.substring(0, 1);

      // fourth word
      rest = rest.substring(space3 + 1);
      initials += rest.substring(0, 1);

      String highSchoolName = initials.toUpperCase();

      //Prices
      double drinkCost = 1.5;
      double candyCost = 1.25;
      double hotDogCost = 2.75;
      double hamburgerCost = 3.5;
      double taxRate = 0.05;

      //Get order quantities from user
      System.out.print("Enter the number of drinks: ");
      int numDrinks = input.nextInt();
      System.out.print("Enter the number of candies: ");
      int numCandy = input.nextInt();
      System.out.print("Enter the number of hot dogs: ");
      int numHotDogs = input.nextInt();
      System.out.print("Enter the number of hamburgers: ");
      int numHamburgers = input.nextInt();

      int orderNumber = (int)(Math.random() * 100 + 1);

      // Report
      System.out.println();
      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*              Welcome               *");
      System.out.println("*          " + highSchoolName + " Snack Bar          *");
      System.out.println("*                                    *");
      System.out.println("*     Drink ..............$ " + drinkCost +
         "      *");
      System.out.println("*     Candy ..............$ " + candyCost +
         "     *");
      System.out.println("*     Hot Dog ............$ " +
         hotDogCost + "     *");
      System.out.println("*     Hamburger ..........$ " + hamburgerCost +
         "      *");
      System.out.println("*                                    *");
      System.out.println("**************************************");

      // Math
      double drinkTotal = numDrinks * drinkCost;
      double candyTotal = numCandy * candyCost;
      double hotDogTotal = numHotDogs * hotDogCost;
      double hamburgerTotal = numHamburgers * hamburgerCost;
      double subtotal = drinkTotal + candyTotal + hotDogTotal + hamburgerTotal;
      double tax = subtotal * taxRate;
      double total = subtotal + tax;

      // only 2 decimal places
      tax = (int)(tax * 100) / 100.0;
      subtotal = (int)(subtotal * 100) / 100.0;
      total = (int)(total * 100) / 100.0;

      // Final
      System.out.println("\n   Order Number    " + orderNumber);
      System.out.println();
      System.out.println("\tQTY\tITEM\t\tTOTAL");
      System.out.println("**************************************");
      System.out.println("\t" + numDrinks + "\tDrink\t\t" + drinkTotal);
      System.out.println("\t" + numCandy + "\tCandy\t\t" + candyTotal);
      System.out.println("\t" + numHotDogs + "\tHot Dog\t\t" + hotDogTotal);
      System.out.println("\t" + numHamburgers + "\tHamburger\t" + hamburgerTotal);
      System.out.println("**************************************");
      System.out.println("\tSubtotal\t " + subtotal);
      System.out.println("\tTax\t\t" + tax);
      System.out.println("\tTotal\t\t" + total);
   }
}