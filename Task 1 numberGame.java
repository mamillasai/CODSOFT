import java.util.*;

public class numberGame {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;
        int chances=6;
        int score=0;
        System.out.println("Hey Gamer!");
        System.out.println("You have about 10 chances to win the game");
        System.out.println("Lets play!");
        int playAgain;
        do{
            int j;
            for( j=0; j<chances;j++){
                System.out.println("chance: "+(j+1) +  " Enter your guess number");
                int guessNum=sc.nextInt();
                if(guessNum==randomNum){
                    System.out.println("your guess is correct!");
                    System.out.println("you won!");
                    score+=1;
                    break;
                }else if(randomNum<guessNum){
                    System.out.println("your guess number is too high...");
                    System.out.println("Try once more");
                }else if(randomNum>guessNum){
                    System.out.println("your guess number is too low");
                    System.out.println("try once more");
                }
            }
            if(j>=chances){
                System.out.println("sorry! your chances are completed");
                System.out.println("you lost the game...The number is "+  randomNum  +  " Better luck next time...");
            }
            System.out.println("if u want to play again enter the number 0");
             playAgain=sc.nextInt();
        }while(playAgain==0);
        System.out.println("your score is"+score);
    }
}
