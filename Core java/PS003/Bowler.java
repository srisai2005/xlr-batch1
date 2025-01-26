
public class Bowler {
    
    private String name;
    private int wickets;
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    
    public Bowler(String name, 
        int wickets, 
        int matches,
        int balls_bowled,
        int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

   
    public void computeBowlingAverage() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }

        if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0) {
            System.out.println("Error");
            return;
        }

        if (wickets == 0) {
            System.out.println("Bowling average cannot be calculated as wickets are 0.");
            return;
        }

        double bowlingAverage = (double) runs_conceded / wickets;
        System.out.println("Name: " + name);
        System.out.print("bowling avg: "+bowlingAverage);
    }

       public static void main(String[] args) {
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);
        bowler.computeBowlingAverage();
    }
} 


