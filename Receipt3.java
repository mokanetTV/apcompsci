/**
 * Receipt2.java  
 *
 * @author – Kiwi
 * @author – BM7
 */ 
public class Receipt3
{
   static String highSchool = "Georgetown Prep";
   static double drinkPrice = 1.50;
   static double candyPrice = 1.25;
   static double hotdogPrice = 2.75;
   static double hamburgerPrice = 3.50;
   static int numberOrder = (int)(Math.random()*100) + 1;
   static int numberDrink = (int)(Math.random()*100) + 1;
   static int numberCandy = (int)(Math.random()*100) + 1;
   static int numberHotDog = (int)(Math.random()*100) + 1;
   static int numberHamburger = (int)(Math.random()*100) + 1;
   static double subtotal = (drinkPrice * numberDrink) + (candyPrice*numberCandy) + (hotdogPrice*numberHotDog) + (hamburgerPrice*numberHamburger);
   static double tax = subtotal * 0.06;
   static double total = subtotal + tax;

   public static void main(String [] args)
   {
      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*     " + highSchool + " Snack Bar      *");
      System.out.println("*                                    *");
      System.out.println("*     Drink ..........$" + drinkPrice + "           *");                      
      System.out.println("*     Candy ..........$" + candyPrice + "          *");     
      System.out.println("*     Hot Dog ........$" + hotdogPrice + "          *");     
      System.out.println("*     Hamburger ......$" + hamburgerPrice + "           *");     
      System.out.println("*                                    *");    
      System.out.println("**************************************");
      System.out.println("*     Order Number....#" + numberOrder + "            *");
      System.out.println("* QTY         ITEM           TOTAL   *");
      System.out.println("* " + numberDrink + "          Drink          $" + drinkPrice + "    *");
      System.out.println("* " + numberCandy + "           Candy          $" + candyPrice + "  *"); 
      System.out.println("* " + numberHotDog + "           Hot Dog        $" + hotdogPrice + "  *");
      System.out.println("* " + numberHamburger + "          Hamburger      $" + hamburgerPrice + "    *");
      System.out.println("**************************************");
      System.out.println("   Subtotal         $" + subtotal + "               ");
      System.out.println("   Tax              $" + tax + "                    ");
      System.out.println("   Total            $" + total + "      ");
      System.out.println("**************************************");
   }
}
