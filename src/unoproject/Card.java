/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package UnoProject;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
import java.util.Random;
public class Card{
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    Random rand = new Random();
    String unoCard;
    private int[] number = {0,1,2,3,4,5,6,7,8,9};
    private final String[] color = {"Red", "Blue", "Green", "Yellow"};
    int numberIndex = rand.nextInt(number.length);
    int colorIndex = rand.nextInt(color.length);
    
    public Card(){
        unoCard = color[colorIndex] + " " + Integer.toString(number[numberIndex]);
    }
    public String toString(){
        return unoCard;
    }

}
