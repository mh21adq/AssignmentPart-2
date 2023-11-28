public class TennisPlayer extends Competitor{
    private int[] scores;
    private String level;
    public TennisPlayer(String name, int age,String geneder, String country, String level)
    {
        super(name,age,geneder,country);
        this.scores=new int[5];
        this.level=level;
    }
    public int[] getScoreArray() {
        return scores;
    }
    public double getOverallScore() {

        return 5;
    }

    @Override
    public double getOverallScore(int top) {
        return 0;
    }
    @Override
    public String getFullDetails()
    {
        return super.getFullDetails()+"\nTennis Player";
    }
    public String getCategory()
    {
        return "Tennis ";
    }
}
