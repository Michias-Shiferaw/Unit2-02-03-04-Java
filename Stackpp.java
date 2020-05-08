//Scan all primitive data types
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

/**
 * This program creates a stack and pushes integers numbers to it, and outputs.
 * all the integers out
 * @author Michias Shiferaw
 * @Version 2.0
 * @since 2020-04-08.
 */


public class Stackpp {
  /**
  * This program creates a stack and pushes integers numbers to it, and outputs.
  * all the integers out
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-04-01.
  */


  public static void main(String[] args) throws IOException {
    //Creating new integer array
    ArrayList<Integer> stacket = new ArrayList<Integer>();
    MrCoxallStackpp tray = new MrCoxallStackpp<Integer>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Scanner input = new Scanner(System.in);

    //Declare variables
    int userInput;
    String another = null;
    String start = null;
    boolean commence = false;
    System.out.println("Hello welcome. Right now there is nothing in the stack so "
        + "would you like to add to the stack? (Y/N)");
    while (commence == false) {
      start = input.next();
      String begin = start.toUpperCase();
      if ((begin.equals("NO")) || (begin.equals("N"))) {
        //as the user inputted that they no longer wants to add more numbers, the boolean is true
        System.out.println("As there is nothing in the stack, and you not wanting to add "
            + "anything to the stack, I see no purpose for you using the program");
        System.out.println("BYE BYE");
        System.exit(0);
      } else if ((begin.equals("YES")) || (begin.equals("Y"))) {
        commence = true;

      } else {
        System.out.println("Sorry your input was not suffiecent for our needs. Please right 'Y'/"
            + "'yes' if you would like to add to the stack , or 'N'/'no' if you do not want to.");
      }
    }


    System.out.println("What would you like to add to the stack?");
    System.out.println("Remember only integers!!");
    try {
      userInput = Integer.parseInt(br.readLine());

      tray.push(userInput);
      int numbers = userInput;
      stacket.add(numbers);

    } catch (NumberFormatException nfe) {
      //the user failed to input an integer resulting into an error
      System.err.println("Invalid input!");
      System.err.println("The program only accepts integers.");

    }
    
    boolean finished = false;
    
    while (finished == false) {
      System.out.println("What would you like to do; push, pop, " 
          + "peek, clear, or are you done? (type whichever suits)");
      String choice = input.next();

      String userChoice = choice.toUpperCase();
      // Pops the last value of stack
      if (userChoice.equals("POP")) {

        try {
          int popValue = tray.pop();
          System.out.println(popValue + " was removed.");
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Unfortunately there is nothing in the stack to pop. ");
        }


      } else if (userChoice.equals("PUSH")) {
        System.out.print("Please enter an input to push. ");
        System.out.println("Remember only integers!!");

        try {
          userInput = Integer.parseInt(br.readLine());

          tray.push(userInput);
          int numbers = userInput;
          stacket.add(numbers);

        } catch (NumberFormatException nfe) {
          //the user failed to input an integer resulting into an error
          System.err.println("Invalid input!");
          System.err.println("The program only accepts integers.");

        }

        //Read user decision on if they would like to input another input
        System.out.println("Are you done? Y/N? ");
        another = input.next();

        String retry = another.toUpperCase();

        if ((retry.equals("Y")) || (retry.equals("YES"))) {
          //as the user inputted that they no longer wants to add more numbers, the boolean is true
          finished = true;

          //Verify if the array list is empty
          boolean verify = stacket.isEmpty();
          if (verify == true) {
            System.out.println("The stack is empty");
          } else if (verify == false) {
            System.out.println("Push numbers;");
            System.out.println(tray.toString());
          }

          System.out.println("Bye Bye");
        } else if ((retry.equals("NO")) || (retry.equals("N"))) {
          finished = false;
        }
      } else if (userChoice.equals("DONE")) {
        System.out.println("BYE BYE");
        System.out.println(tray.toString());
        System.exit(0);
        
      } else if (userChoice.equals("PEEK")) {

        try {
          int peekValue = tray.peek();
          if (peekValue == -1) {
            System.out.println("Unfortunately there is nothing in the stack to peek. ");
          } else {
            System.out.println(peekValue + " was the final value.");
          }
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Unfortunately there is nothing in the stack to peek. ");
        }
        
      } else if (userChoice.equals("CLEAR")) {

        try {
          tray.clear();
          System.out.println("All has been wiped");
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Unfortunately you can't clear nothing. ");
        }
        
      } else {
        System.out.println("Your input was not insufficient enough.");
      } 
    }
  }
}