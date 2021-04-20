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
public class Hand extends Player {
    Card card = new Card();
    public Hand(){
        
    }
    public void playerHand(){
        for(int i=0;i<numOfPlayers;i++){
            System.out.println(names.get(i) + " cards are");
            for(int j=0;j<7;i++){
                System.out.println(card.unoCard);
            }
        }
    }
}
