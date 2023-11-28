public class Athlete extends Competitor{
    private int[] scores;
    public Athlete(String name, int dob, String country, String level)
    {
        super(name,dob,country,level);
        this.scores=new int[4];
    }

    @Override
    public double getOverallScore() {
        return 0;
    }

    @Override
    public double getOverallScore(int top) {
        return 0;
    }

    public int[] getScoreArray() {
        return scores;
    }
}
