import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] colors = new String[7];
        colors[0] = "Orange";
        colors[1] = "Yellow";
        colors[2] = "Red";
        colors[3] = "Indigo";
        colors[4] = "Blue";
        colors[5] = "Violet";
        colors[6] = "Green";
        int[] wins = new int[7];
        File filliac = new File("Scoreboard.txt");
        Scanner s = new Scanner(filliac);
        Team team1;
        Team team2;
        Team winner;
        Scoreboard boardOfScore;
        for (int i = 0; i < 1000; i++){
            team1 = new Team(s.next());
            team2 = new Team(s.next());
            boardOfScore = new Scoreboard("" + team1, "" + team2);
            while (s.hasNextInt()){
                boardOfScore.play(s.nextInt());
            }
            winner = boardOfScore.winner();
            for (int j = 0; j < colors.length; j++){
                if (colors[j].equals(winner.getName())){
                    wins[j]++;
                }
            }
        }
        for (int i = 0; i < colors.length; i++){
            System.out.println(" " + colors[i] + " " + wins[i]);
        }
    }
}
