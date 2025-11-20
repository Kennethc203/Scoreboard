import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("ExclamationPoint");
        Scoreboard game = new Scoreboard("Red", "Blue");
        System.out.println(game.getScore());
        game.recordPlay(1);
        System.out.println(game.getScore());
        game.recordPlay(0);
        System.out.println(game.getScore());
        game.recordPlay(3);
        System.out.println(game.getScore());
        game.recordPlay(1);
        game.recordPlay(0);
        System.out.println(game.getScore());
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        String info = game.getScore();

        game = new Scoreboard("Lions", "Tigers");
        System.out.println(game.getScore());
        System.out.println(info);



        //Time for the task again
        String[] teams = new String[7];
        teams[0] = "Orange";
        teams[1] = "Yellow";
        teams[2] = "Red";
        teams[3] = "Green";
        teams[4] = "Blue";
        teams[5] = "Indigo";
        teams[6] = "Violet";
        int[] teamsWins = new int[7];
        String team1 = "";
        String team2 = "";
        Scoreboard match;
        String winnerName = "";
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        while (s.hasNext()){
            team1 = s.next();
            team2 = s.next();
            match = new Scoreboard(team1, team2);
            while (s.hasNextInt()) match.recordPlay(s.nextInt());
            winnerName = match.returnWinner();
            for (int i = 0; i < teams.length; i++){
                if (winnerName.equals(teams[i])) {
                    teamsWins[i] += 1;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < teams.length; i++){
            System.out.println(teams[i] + " "+ teamsWins[i]);
        }
    }
}
