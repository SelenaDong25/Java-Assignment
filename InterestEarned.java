
/*
   Program: InterestEarned.java
   Created by Xin Dong
   This program is to calculate compound interest earned from saving account
   January 8, 2019
 */
import java.util.Scanner; // Needed for the Scanner class
import java.text.DecimalFormat;  // Needed for double number roundup

public class InterestEarned {
    public static void main(String[] args) 
    {
        double principal;      //hold account principal amount
        double rate;           //hold interested rate in decimal
        double amount;         //hold amount in saving 
        int tCompounded;       //hold times of compounded in a year
        double interest;       //hold interest amount
        // create scanner object to read input
        Scanner keyboard = new Scanner(System.in); 
        // Round up double to 2 decimals
        DecimalFormat df = new DecimalFormat ("###.##"); 
        // Prompt user to enter the principal.
        System.out.print("Input Principal:");
        // input principal
        principal = keyboard.nextDouble();
        // Promt user to enter the interested rate.
        System.out.print("Input interest rate in decimal:");
        // Input interest rate
        rate = keyboard.nextDouble();   
        // Promt user to enter compound times.
        System.out.print("Input Compounded times in a year:");
        // Input compounded times 
        tCompounded = keyboard.nextInt();          
        // Calculate amount in saving account
        amount = principal * (Math.pow((1 + rate/tCompounded),tCompounded));
        // Calculate interest amount
        interest = amount - principal;

        // Print the principal, rate, compound, interest, amount in saving on screen.
        System.out.printf("Principal: $%10d.\n",df.format(principal)); 
        System.out.printf("Interest Rate: %10d.\n",df.format (rate*100)); 
        System.out.printf("Times Compounded: %10d%.\n",df.format (tCompounded)); 
        System.out.printf("Interest: $%10d.\n",df.format(interest));
        System.out.printf("Amount in Saving: $%10d.\n",df.format(amount));
        
        /* System.out.println("Principal:     $"+ df.format(principal)+".\n" 
             + "Interest Rate:     " + df.format (rate*100) +"%" + ".\n" 
             + "Times Compounded:     " + df.format (tCompounded)+ ".\n" 
             + "Interest:      $" + df.format(interest)+".\n"
             + "Amount in Saving:     $" + df.format(amount)+"." );    */
   
    // ********* Program solution algorithm ***********
    
    // Implement the following step-by-step plan
    
    // 1. Enable keyboard input method
    // 2. Import DecialFormat class
    // 3. Declare double and interger variable to store input data  
    // 4. Prompt the user to input principal
    // 5. Prompt the user to input interest rate in decimal format
    // 6. Prompt the user to input compounded times in a year 
    // 7. Calculate amount in saving account
    // 8. Calculate interest earned
    // 9. Round up double number with 2 decimals
    // 10. Print out Principal, Interest Rate, Times Compounded, Amount in 
    //     Saving, and Interest earned
    
    // ********* Program solution algorithm ***********   
    }
}
