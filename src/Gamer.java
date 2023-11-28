public class Gamer extends Competitor{

    private int[] scores;
    public Gamer(String name, int age, String country, String level)
    {
        super(name,age,country,level);
        this.scores=new int[5];
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
}
