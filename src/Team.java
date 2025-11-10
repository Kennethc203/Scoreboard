public class Team {
    private String name;
    private int points = 0;
    public Team(String n){
        name = n;
    }
    public void addPoints(int num){
        points += num;
    }
    public int getPoints(){
        return points;
    }
    public String toString(){
        return name;
    }
}
