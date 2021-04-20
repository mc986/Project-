
package UnoProject;

/**
 *
 * @author bener
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Register extends Player{
    int numOfPlayers;
    Scanner sc = new Scanner(System.in);
   
    
    public void enterPlayers() {
        boolean done = false;
        while(done == false){
            System.out.println("Enter Number of Players:  ");
            int getNum = sc.nextInt();
            if (getNum > 0 && getNum <= 10){
                this.numOfPlayers = getNum;
                done = true;
            }
            else{
                System.out.println("Number of players must be 1 to 10");
            }
        }
    }

    public void enterName() {
        System.out.println("---- Enter Player Names ----");
        for(int i=0;i<numOfPlayers;i++){
            int count = i+1;
            System.out.println("Player: " +  count);
            String input = sc.next();
            names.add(input);
        }
    }

    public void displayNames() {
        System.out.println("---- Players of the Game ----");
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }

    public void displayPlayers() {
        System.out.println("Numbers of Player: " + names.size());
    }
    
}
