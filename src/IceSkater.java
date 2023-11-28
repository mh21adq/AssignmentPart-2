import java.util.Arrays;
public class IceSkater extends Competitor{
    private int[] scores;
    String level;
    public IceSkater(String name, int age,String gender, String country, String level)
    {
        super(name,age,gender,country);
        this.level=level;
        this.scores=new int[5];
    }
    public int[] getScoreArray() {
        return scores;
    }
    public void enterScore(int[] scores)
    {
        this.scores=scores;
    }

    @Override
    public double getOverallScore(int top) {
        Arrays.sort(scores);
        int total=0;
        double average;
        for(int i=0;i< top;i++)
        {
            total+=scores[i];
        }
        average=total/top;
        return average;


    }
}
