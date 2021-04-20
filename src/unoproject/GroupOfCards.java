/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package UnoProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards{

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;
    /**
     * The group of cards, stored in an ArrayList
     */
    private Collection<Card> attribute;
    /**
     * The group of cards, stored in an ArrayList
     */
//    private ArrayList<Card> cards;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }
    // shuffles the cards
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = 7;
    }

    public Collection<Card> getAttribute() {
        return this.attribute;
    }

    public void leftovers() {
        // TODO - implement GroupOfCards.leftovers
        throw new UnsupportedOperationException();
    }

//    public Collection<Card> getCards() {
//        return this.cards;
//    }


}//end class
