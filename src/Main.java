import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] winners = new String[1000];
        int[] winnerPoints = new int[1000];
        File filliac = new File("Scoreboard.txt");
        Scanner s = new Scanner(filliac);
        Team team1;
        Team team2;
        Scoreboard boardOfScore;
        for (int i = 0; i < 1000; i++){
            team1 = new Team(s.next());
            team2 = new Team(s.next());
            boardOfScore = new Scoreboard("" + team1, "" + team2);
            while (s.hasNextInt()){
                boardOfScore.play(s.nextInt());
            }
            winners[i] = boardOfScore.winner();
            winnerPoints[i] = boardOfScore.winnerPoints();
            System.out.println(winners[i]);
            System.out.println("");
            System.out.println(winnerPoints[i]);
        }
    }
}
