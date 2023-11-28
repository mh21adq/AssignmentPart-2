public class Gamer extends Competitor {

    private int[] scores;
    private LevelInteger level;
    private   String category ;

    public Gamer(Name name, String email, int age, String gender, String country, LevelInteger level) {
        super(name, email, age, gender, country);
        this.level = level;
        this.category = "ELECTRONICGAMER";
        this.scores = new int[5];
    }

    public LevelInteger getLevel() {
        return level;
    }

    public void setLevel(LevelInteger level) {
        this.level = level;
    }

    public  String getCategory() {
        return this.category;
    }

    // Override methods or add additional methods specific to IceSkatingCompetitor

    @Override
    public String getFullDetails() {
        String details = super.getFullDetails() + "\nLevel: " + this.level.name() + "\nCategory: " + category
                +"\nScores:"+this.getScores();
        return details;
    }
    public String getScores()
    {
        String ss = "";
        for (int i = 0; i < this.scores.length; i++) {
            ss += this.scores[i];
            if (i < this.scores.length - 1) {
                ss += ",";
            }
        }
        return ss;
    }
    @Override
    public String getShortDetails() {
        String shortDetails = super.getShortDetails() + " in category " + category+"Scores:"+this.getScores();
        return shortDetails;
    }

    @Override
    public double getOverallScore() {
        return 0;
    }

    public void setScores(int[] scores) {
        this.scores=scores;
    }
    public int[] getScoreArray()
    {
        return this.scores;
    }
    // Additional methods specific to Gamer, if any, can be added here
}
