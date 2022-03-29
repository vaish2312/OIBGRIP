package classes;
import java.util.Scanner;
public class Numberguessinggame 
{

	public static void
	guessingNumberGame()
	{
		
		Scanner sc = new Scanner(System.in);
		 
		int number = 1+ (int)(100*Math.random());
		int k = 5;
		int i, guess;
		System.out.println("A number is choosen"
				            +"between 1 to 100"
			                 +"Guess the number"
				            +"Within 5 trials.");
		
		for(i= 0;i<k ; i++){
		   System.out.println("Guess the number:");
		   guess = sc.nextInt();
		   if(number==guess){
			   System.out.println("Congratulations!"+"you guessed the number.") ;
			   break;

		   }else if (number > guess
                   && i != k - 1) {
              System.out.println(
                  "The number is "
                  + "greater than " + guess);
          }
          else if (number < guess
                   && i != k - 1) {
              System.out.println(
                  "The number is"
                  + " less than " + guess);
          }
      }

      if (i == k ) {
          System.out.println(
              "You have exhausted"
              + " K trials.");

          System.out.println(
              "The number was " + number);
      }
  }

  // Driver Code
  public static void
  main(String arg[])
  {

      // Function Call
      guessingNumberGame();
		
	}
	
	
}
