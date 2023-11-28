import java.util.ArrayList;

public class CompetitorList {
    private ArrayList<Competitor> competitors;

    public CompetitorList() {
        this.competitors = new ArrayList<>();
    }

    // Method to add a competitor
    public void addCompetitor(Competitor competitor) {
        this.competitors.add(competitor);
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }
    public void Print()
    {
        for (Competitor com:this.competitors) {
            System.out.println("Hi");

        }
    }
    // Other methods for reporting and statistics...
}
