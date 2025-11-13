public class Scoreboard {
    private Team team1;
    private Team team2;
    private Team active;

    public Scoreboard(String name1, String name2) {
        team1 = new Team(name1);
        team2 = new Team(name2);
        active = team1;
    }
    public void play(int points){
        active.addPoints(points);
        if (points == 0){
            if (active.equals(team1)) active = team2;
            else active = team2;
        }
    }
    public String winner(){
        if (team1.getPoints() > team2.getPoints()) return team1.getName();
        else if (team2.getPoints() > team1.getPoints()) return team2.getName();
        else return "";
    }
    public int winnerPoints(){
        if (team1.getPoints() > team2.getPoints()) return team1.getPoints();
        else if (team2.getPoints() > team1.getPoints()) return team2.getPoints();
        else return 0;
    }
}
