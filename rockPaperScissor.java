/*User vs Computer  rock-paper-Scissor game simulator...*/

/*This code simulate Two player Rock-paper-cissor game 
Here i have assignes numeric values to each possible outcome
Rock = 1 ,paper = 2  and scissor = 3 */

/*Gmae Rules:
        1.Rock beats scissors
        2.Scissors beats paper
        3.Paper beats rock */

import java.util.*;
import java.util.concurrent.TimeUnit;


class rockPaperScissor{

public void rpcGame(){

    int choice = 1;
    String rules = "1. Rock beats scissors " + " 2. Scissors beats paper " + "3. Paper beats rock ";
    
    System.out.println("\nRules " + rules);
    Scanner ip = new Scanner(System.in);
    System.out.println("\n Enter 0 to Start the Game..!");
    choice = ip.nextInt();
    if(choice == 0){
      
     while(choice == 0) {

    //Rock-Paper-Scissor animation code...

    String string = "Rock...Paper...Scissor...Rock...Paper...Scissor";
    char[] animation = string.toCharArray();
    //rpcGame();
    for(int i=0; i<animation.length; i++){
        
/*Java have Thread.sleep() which gives delay in milliseconds...it always require try and catch pair 
to work */
        try{
        System.out.print(animation[i]);
        Thread.sleep(100);
                }
                catch(InterruptedException ie){
        ie.printStackTrace();
        }
    }
    


//**************************************************************** */
                    
    int player =   (int)(Math.random()*((3 - 1) + 1)) + 1;
    int computer = (int)(Math.random()*((3 - 1) + 1)) + 1;

            //random number generation

            if(player == computer){
                System.out.println("\n Same outcome ,No one Win or Lose..!! Try again.");
            }

            if( player == 1 && computer == 2)
            System.out.println("\n computer Wins..!! Rule3: Paper beats rock"); 
            else if(player == 1 && computer == 3)
            System.out.println("\n You wins..!! Rule1: Rock beats scissors");
            else if(player == 2 && computer == 1)
            System.out.println("\n You wins..!! Rule3: Paper beats rock");
            else if(player == 2 && computer == 3)
            System.out.println("\n computer wins..!! rule2: Scissors beats paper");
            else if(player == 3 && computer == 1)
            System.out.println("\n computer wins..!! Rule1: Rock beats Scissor");
            else if(player == 3 && computer == 2)
            System.out.println("\n You wins..!! Rule2: Scissors beats paper");
            

       

            System.out.println("\n Enter 0 to play again or any other key to abort..!");
            choice = ip.nextInt();
        
     }
    
   }

 }

}


