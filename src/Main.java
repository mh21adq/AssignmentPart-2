import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        System.out.println("Name class test\n");
        Name firstname = new Name("Numan");
        System.out.println(firstname.getFirstName());
        System.out.println(firstname.getMiddleName());
        System.out.println(firstname.getFullName());
        System.out.println(firstname.getInitials());

        Name firstAndMiddle = new Name("Numan", "Hussain");
        System.out.println(firstAndMiddle.getFirstName());
        System.out.println(firstAndMiddle.getMiddleName());
        System.out.println(firstAndMiddle.getFullName());
        System.out.println(firstAndMiddle.getInitials());

        Name fullName = new Name("Numan", "Hussain", "Mahim");
        System.out.println(fullName.getFirstName());
        System.out.println(fullName.getMiddleName());
        System.out.println(fullName.getFullName());
        System.out.println(fullName.getInitials());

        TennisPlayer tennisPlayer1 = new TennisPlayer("Samir", 30, "Male", "Bd", "Novice");
        CompetitorList compL = new CompetitorList();

        compL.addCompetitor(tennisPlayer1);
        TennisPlayer tennisPlayer2 = new TennisPlayer("Numan Hussain", 30, "Male", "Bd", "Novice");
        compL.addCompetitor(tennisPlayer2);
        TennisPlayer tennisPlayer3 = new TennisPlayer("Arsal is A", 30, "Male", "Bd", "Novice");
        compL.addCompetitor(tennisPlayer3);
        Manager man = new Manager();
        man.readFromFile("RunCompetitor.csv");
        CompetitorList competitorList=new CompetitorList();
        competitorList.Print();



    }
}