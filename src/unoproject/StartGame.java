/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnoProject;

/**
 *
 * @author bener
 */
public class StartGame extends Register{
    public static void main(String[] args){
        Game game = new Game();
        Card card = new Card();
        Hand hand = new Hand();
        Register register = new Register();
        register.enterPlayers();
        register.enterName();
        register.displayPlayers();
        register.displayNames();
        hand.playerHand();
        
        
    }
}
