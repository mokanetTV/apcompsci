import java.util.Scanner;

/**
 * Receipt4.java
 *
 * @author - Kiwi
 * @author - BM7
 *
 */
public class Receipt5
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);


      String companyName = "Shake Shack";

      //Prices
      double drinkCost = 1.5;
      double friesCost = 1.25;
      double hotDogCost = 2.75;
      double hamburgerCost = 3.5;
      double taxRate = 0.05;

      //Get order quantities from user
      System.out.print("Enter the order name: ");
      String orderName = input.next();
      System.out.print("Enter the order time: ");
      String orderTime = input.next();
      System.out.print("Enter the number of drinks: ");
      int numDrinks = input.nextInt();
      System.out.print("Enter the number of fries: ");
      int numFries = input.nextInt();
      System.out.print("Enter the number of hot dogs: ");
      int numHotDogs = input.nextInt();
      System.out.print("Enter the number of hamburgers: ");
      int numHamburgers = input.nextInt();

      int orderNumber = (int)(Math.random() * 100 + 1);

      // Report
      System.out.println("SHAKE SHACK");
      System.out.println("7997 Tuckerman Lane");
      System.out.println("Potomac, MD 20854");
      System.out.println("Host: Mr. Jimbobb              09/10/2021");
      System.out.print(orderName + "          " + orderTime);
      System.out.println();
      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*              Welcome               *");
      System.out.println("*          " + companyName + "             *");
      System.out.println("*                                    *");
      System.out.println("*     Drink ..............$ " + drinkCost +
         "      *");
      System.out.println("*     Fries ..............$ " + friesCost +
         "     *");
      System.out.println("*     Hot Dog ............$ " +
         hotDogCost + "     *");
      System.out.println("*     Hamburger ..........$ " + hamburgerCost +
         "      *");
      System.out.println("*                                    *");
      System.out.println("**************************************");

      // Math
      double drinkTotal = numDrinks * drinkCost;
      double friesTotal = numFries * friesCost;
      double hotDogTotal = numHotDogs * hotDogCost;
      double hamburgerTotal = numHamburgers * hamburgerCost;
      double subtotal = drinkTotal + friesTotal + hotDogTotal + hamburgerTotal;
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
      System.out.println("\t" + numFries + "\tCandy\t\t" + friesTotal);
      System.out.println("\t" + numHotDogs + "\tHot Dog\t\t" + hotDogTotal);
      System.out.println("\t" + numHamburgers + "\tHamburger\t" + hamburgerTotal);
      System.out.println("**************************************");
      System.out.println("\tSubtotal\t " + subtotal);
      System.out.println("\tTax\t\t" + tax);
      System.out.println("\tTotal\t\t" + total);
   }
}