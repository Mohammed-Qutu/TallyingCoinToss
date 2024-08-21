/*Mohammed Qutu
2/3/2024
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
Tally Heads And Tails on Coin Tosses
 */
import java.util.Scanner;
import java.util.Random;
public class TallyingCoinTossExercise 
{

    public static void main(String[] args) 
    {
        Scanner Keyboard = new Scanner(System.in);
        Random randomNumber = new Random(1); // Generate randome number 0-1
        
        int timesToFlip;
        double r;
       
        System.out.println("How many times would you like to flip the coin?: ");
        timesToFlip = Keyboard.nextInt();
        
        int headCounter=0;
        int tailCounter=0;
        
        for(int i=0; i<timesToFlip; i++)
        {
           
            r = randomNumber.nextDouble(); //Generat Random Number
            if( r >= .5)//fair chance of heads/tails
            {
                System.out.println("Heads");
                headCounter++;
            }
            else
            {
                System.out.println("Tails");
                tailCounter++;
            }
            
        }
        System.out.println("Number of head: " + headCounter);
        System.out.println("Number of tails: " + tailCounter);
    }
}
