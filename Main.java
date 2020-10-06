import java.util.Scanner;
/**
 * a program to determine how much money a user invested
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user the amount of money they want to invest
    System.out.println("Please enter a starting balance");
    double balance = input.nextDouble();

    // ask the user for their interest rate
    System.out.println("Please enter your interest rate");
    int rate = input.nextInt();

    // create a variable for the percentage of the interest
    double rateP = rate/100.0;
    
    // ask the user for the amount of years they will invest for
    System.out.println("Please enter the number of years you will invest for");
    int years = input.nextInt();

    // create a variable for the starting balance and interest rate
    double interest = balance * rateP;

    // create a for loop for the years
    for(int count = 1; count <= years; count++){
      interest = balance * rateP;
      balance = balance + interest;
    }
      // show the total
      System.out.println("Your final balance would be " + balance);
  }
}
