import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PlayGame {
    private static Scanner in = new Scanner(System.in);
    private static String question = "0";
    private static String questionBeforeExit = "0";
    private static double distanceFromEndX = 4.00;
    private static double distanceFromEndY = 3.00;
    private static double distanceFromEnd = 5.00;

    public PlayGame(){}



    public enum Direction {
        N, S, E, W
    }
    Direction direction;

    public void StartGame(){
        String playerName = "";

        while(true){
            switch (question){

                case ("-1"):
                    System.out.println("Do you want to exit the game?\n[Y] Yes\n[N] No\n");
                    question = "-1A";
                    break;

                case ("-1A"):
                    switch (in.next().toLowerCase()){
                        case ("y"):
                            question = "-1B";
                            break;
                        case ("n"):
                            question = questionBeforeExit;
                            break;
                        default:
                            question = "-1";
                            break;

                    }
                    break;
                case ("-1B"):
                    System.out.println("Game Ended");
                    in.close();
                    question = "";
                    break;

                case ("-1C"):
                    System.out.println("You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
                    in.close();
                    question = "";
                    break;

                case ("0"):
                    System.out.println("What is your name?\n");
                    question = "1";
                    questionBeforeExit = "0";
                    break;

                case ("1"):
                    playerName = in.next();
                    question = "1A";
                    questionBeforeExit = "1";
                    break;

                case ("1A"):
                    System.out.println(playerName+" do u want to play this game?\n[Y] Yes\n[N] No\n");
                    question = "2";
                    questionBeforeExit = "1A";
                    break;

                case ("2"):
                    switch (in.next().toLowerCase()){
                        case ("y"):
                            question = "3";
                            break;
                        case ("n"):
                            question = "-1";
                            break;
                        default:
                            question = "-1";
                            break;
                    }
                    break;

                case ("3"):
                    System.out.println("Welcome to The adventure of the barren moor");
                    question = "3A";
                    questionBeforeExit = "3";
                    break;

                case ("3A"):
                    System.out.println("You awaken to find yourself in a barren moor.  Try \"look\"\n");
                    question = "3B";
                    questionBeforeExit = "3A";
                    break;


                case ("3B"):
                    switch (in.next().toLowerCase()){
                        case ("look"):
                            question = "4";
                            break;
                        default:
                            question = "-1";
                            break;
                    }
                    break;

                case ("4"):
                    System.out.println("Grey foggy clouds float oppressively close to you,\n" +
                            "reflected in the murky grey water which reaches up your shins.\n" +
                            "Some black plants barely poke out of the shallow water.\n" +
                            "Try \"north\",\"south\",\"east\",or \"west\"\n" +
                            "You notice a small watch-like device in your left hand.  \n" +
                            "It has hands like a watch, but the hands don't seem to tell time.\n");
                    question = "4A";
                    questionBeforeExit = "4";
                    break;
                case ("4A"):
                    System.out.print("The dial reads '" + String.format( "%.2f", distanceFromEnd ) + "m'\n>");
                    switch (in.next().toLowerCase()){
                        case("n"):
                        case ("north"):
                            distanceFromEnd(Direction.N);
                            if(distanceFromEnd>0.4){

                                question = "4A";
                            }
                            else if(distanceFromEnd < 0.4){
                                question = "-1C";
                            }
                            break;

                        case("s"):
                        case ("south"):
                            distanceFromEnd(Direction.S);
                            if(distanceFromEnd>0.4){
                                if(distanceFromEnd==1.00){
                                    encounterBogeyMon();
                                }
                                question = "4A";
                            }
                            else if(distanceFromEnd < 0.4){
                                question = "-1C";
                            }
                            break;
                        case("e"):
                        case ("east"):
                            distanceFromEnd(Direction.E);
                            if(distanceFromEnd>0.4){
                                question = "4A";
                            }
                            else if(distanceFromEnd < 0.4){
                                question = "-1C";
                            }
                            break;
                        case("w"):
                        case ("west"):
                            distanceFromEnd(Direction.W);
                            if(distanceFromEnd>0.4){
                                if(distanceFromEnd==1.00){
                                    encounterBogeyMon();
                                }
                                question = "4A";
                            }
                            else if(distanceFromEnd < 0.4){
                                question = "-1C";
                            }
                            break;
                        default:
                            question = "-1";
                            break;
                    }
                    break;
            }
        }
    }

    public String distanceFromEnd(Direction direction){
        if(direction == Direction.N){
            distanceFromEndY = distanceFromEndY-0.5;
        }
        else if(direction == Direction.S){
            distanceFromEndY = distanceFromEndY+0.5;
        }
        else if(direction == Direction.E){
            distanceFromEndX = distanceFromEndX+0.5;
        }
        else if(direction == Direction.W){
            distanceFromEndX = distanceFromEndX-0.5;
        }
        distanceFromEnd = Math.sqrt(((distanceFromEndY*distanceFromEndY)+(distanceFromEndX*distanceFromEndX)));
        return String.format( "%.2f", Math.sqrt(((distanceFromEndY*distanceFromEndY)+(distanceFromEndX*distanceFromEndX))));
    }

    public void encounterBogeyMon(){
        System.out.print("You encountered the bogey mon\n");
        distanceFromEndX = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        distanceFromEndY = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        distanceFromEnd = Math.sqrt(((distanceFromEndY*distanceFromEndY)+(distanceFromEndX*distanceFromEndX)));
    }
}
