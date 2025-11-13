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
    public Team winner(){
        Team winner = new Team("");
        if (team1.getPoints() > team2.getPoints()){
            winner = new Team(team1.getName());
            winner.addPoints(team1.getPoints());
        }
        else if (team2.getPoints() > team1.getPoints()){
            winner = new Team(team2.getName());
            winner.addPoints(team2.getPoints());
        }
        return winner;

    }
}
