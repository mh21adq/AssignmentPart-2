public class Gamer extends Competitor {

    private int[] scores;
    private Level level;
    private   String category ;

    public Gamer(Name name, String email, int age, String gender, String country, Level level) {
        super(name, email, age, gender, country);
        this.level = level;
        this.category = "GAMING";
        this.scores = new int[5];
    }

    public Level getLevel() {
        return level;
    }


    public void setLevel(Level level) {
        this.level = level;
    }

    public  String getCategory() {
        return this.category;
    }

    // Override methods or add additional methods specific to IceSkatingCompetitor

    @Override
    public String getFullDetails() {
        String details = super.getFullDetails()
                +"\nand received these scores :"+this.getScores()+"\nThis gives him an overall score of "+this.getOverallScore();
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
        int [] scores=this.scores;
        double sum=0;
        for(int i=0;i<scores.length;i++)
        {
            sum+=scores[i];
        }
        return sum/scores.length;
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
