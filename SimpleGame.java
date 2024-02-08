import java.util.Scanner;

interface Game{
    public String Playername ();
}

interface Story{
    public void StoryMode () ;
}

interface Survival{
    public void SurvivalMode ();
}

interface Chances extends Survival{
    public void SurvivalMode ();
    public int NumOfGuess () ;
}
class StoryModeQues1 implements Story{
    
    public void StoryMode (){
        System.out.println("Answer these 3 question to test your understanding!\n") ;
        System.out.println("What are two things you can never eat for breakfast?");
        System.out.println ("A. Steak and Wine") ;
        System.out.println("B. Lunch and Dinner") ;
        System.out.println("C. Nova and Coke" + "\n");
        System.out.print("Your answer is? ");
    }
}
class StoryModeQues2 implements Story{
    public void StoryMode () {
        System.out.println("What is always coming but never arrives?");
        System.out.println("A. Tomorrow") ;
        System.out.println("B. Car");
        System.out.println("C. Time" + "\n");
        System.out.print ("Your answer is? ");
    }
}
class StoryModeQues3 implements Story{
    
    public void StoryMode () {
        System.out.println ("What never asks a question but gets answered all the time?") ;
        System.out.println ("A. Your age") ;
        System.out.println ("B. A clock") ;
        System.out.println("C. Your cellphone" + "\n");
        System.out.print ("Your answer is? ");
    }
}
class SurvivalModeQues implements Chances{

    static Scanner SuvMode = new Scanner (System. in) ;
    int guess = 1;
    int guessLeft = 5;
    
    public void SurvivalMode() {
        System.out.println ("Try to answer this question and win!");
        System. out.println ("But .... you only have 5 chances to geuss the right word!") ;
        System. out.println ("Goodluck !! \n");
        System. out.println ("Now the question is ... ");
        System. out.println ("What has one eye but can't see anything at all?");
        System.out.print ("Your answer is: ");
        String SuvModeAns;
        
        SuvModeAns = SuvMode. nextLine ();

        while (!SuvModeAns.contains ("needle") || !SuvModeAns.contains ("Needle")) {
            
            if (SuvModeAns.contains ("needle") || SuvModeAns.contains ("Needle")) {
                System. out.print ("\n");
                System.out.println("With only " + guess + " guess (es), you entered the right answer!");
                SimpleGame player = new SimpleGame() ;
                String name = player. Playername ();
                System.out.println ("Congratualtions " + name + ", you won!");
                System.exit(0);
            }
            
            if (guess == NumOfGuess () ) {
                System.out.println ("Sorry but you run out of chances!");
                System. out.println("You lose! : (");
                System.exit (0);
            }
            
            guess++;
            guessLeft --;
            
            System.out.print ("\n");
            System. out.println("Your Answer is wrong.") ;
            System. out.println ("You only have " + guessLeft + " chances to guess") ;
            System. out.print ("Try again: ");
            SuvModeAns = SuvMode.nextLine ();
        }
    }
    public int NumOfGuess () {
        return 5;
    }
}
    
public class SimpleGame implements Game{
    
    static String playerName;
    static int option;
    static Scanner ans = new Scanner (System. in);
    
    @Override
    public String Playername () {
        return playerName;
    }
    
    public static void main(String[] args) {
        
        System.out.print ("Enter your name: ");
        playerName = ans.nextLine();
        
        SimpleGame player = new SimpleGame();
        String name = player. Playername ();
        
        System. out.println ("Press 1 or 2 to select your game mode.") ;
        System.out.println("1 - Story");
        System.out.println ("2 - Survival");
        option = ans.nextInt ();
        String press;
        
//Story mode
        if (option == 1) {
            Scanner ansOP1 = new Scanner (System. in) ;
            
            System. out.println("Story mode is chosen!") ;
            System. out.println("Press p to start playing, " + name + ".") ;
            press = ansOP1. nextLine ();
            
            if (press.equalsIgnoreCase ("P") ) {
                System.out.println("Alright! Let's start playing!");
                    StoryModeQues1 ques1 = new StoryModeQues1();
                    ques1. StoryMode () ;
                    String sagotl;
                    boolean sagotBoll = true;
                    sagotl = ansOP1.nextLine ();
                    while (!sagotl.equalsIgnoreCase ("B")) {
                        System.out.println("Your Answer is wrong.") ;
                        System.out.print ("Try again: ");
                        sagotl = ansOP1.nextLine ();
                        
                        if (sagotl.equalsIgnoreCase ("B")) {
                            sagotBoll = false;
                        }
                    }                       
                    System.out.println ("You got it right, " + name + ". \n");

                    StoryModeQues2 ques2 = new StoryModeQues2 ();
                    ques2. StoryMode () ;
                    String sagot2;
                    boolean sagotBo12 = true;
                    sagot2 = ansOP1.nextLine ();
                    
                    while(!sagot2.equalsIgnoreCase ("A") ) {
                        System.out.println ("Your Answer is wrong.") ;
                        System.out.print ("Try again: ") ;
                        sagot2 = ansOP1.nextLine ();
                        
                        if (sagot2.equalsIgnoreCase ("A")) {
                        sagotBo12 = false;
                    }
                }
                System.out.println("You got it right, " + name + ". \n");
                
                StoryModeQues3 ques3 = new StoryModeQues3 ();
                ques3. StoryMode () ;
                String sagot3;
                boolean sagotBol3 = true;
                sagot3 = ansOP1.nextLine ();
                
                while (!sagot3.equalsIgnoreCase ("C")) {
                    System. out.println("Your Answer is wrong.") ;
                    System.out.print ("Try again: ");
                    sagot3 = ansOP1.nextLine ();
                    if (sagot3.equalsIgnoreCase ("C")) {
                        sagotBol3 = false;
                    }
                }
                System.out.println("You got it right, " + name + ".") ;
                System.out.println ("Congratualtions " + name + "!"
                        + " You answered all the questions") ;
            }
        }
        //Survival mode
        if (option == 2) {
            Scanner ansOP2 = new Scanner (System. in) ;
            
            System.out.println ("Survival mode is chosen!");
            System.out.println("Press p to start playing, " + name + ".") ;
            press = ansOP2.nextLine ();
            
            if (press.equalsIgnoreCase ("P")) {
                System.out.println("Alright! Let's start playing!") ;
            
                SurvivalModeQues quesSurv = new SurvivalModeQues ();
                quesSurv. SurvivalMode ();
            }
        }
        
    }
}
