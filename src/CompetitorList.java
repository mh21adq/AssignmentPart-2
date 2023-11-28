import java.util.ArrayList;
import java.util.List;

public class CompetitorList {
    private static ArrayList<Competitor> competitors = new ArrayList<>();

    // Method to add a competitor
    public void addCompetitor(Competitor competitor) {
        CompetitorList.competitors.add(competitor);
    }

    // Method to remove a competitor
    public void removeCompetitor(Competitor competitor) {
        CompetitorList.competitors.remove(competitor);
    }

    // Method to get all competitors
    public static ArrayList<Competitor> getAllCompetitors() {
        return new ArrayList<>(CompetitorList.competitors);
    }

    // Other methods...
}
