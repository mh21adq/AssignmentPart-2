
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionException;

public class Manager {
    private CompetitorList competitorList = new CompetitorList();


    // Method to read competitors from a file



    public void readFromFile(String fname) {
        try {
            File file = new File(fname);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int competitorNumber = Integer.parseInt(data[0].trim());
                String fullName = data[1].trim();
                //converting to Name typ from String
                Name name=this.createNameFromFullName(fullName);
                String email = data[2].trim();
                int age = Integer.parseInt(data[3].trim());
                String gender = data[4].trim();
                String level = data[5].trim().toUpperCase();
                String category = data[6].trim();
                String country = data[7].trim();
                // Scores start from the 8th index, parse until the end of the array
                int[] scores = new int[data.length - 8];
                for (int i = 8; i < data.length; i++) {
                    try {
                        scores[i - 8] = Integer.parseInt(data[i].trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid score format: " + data[i]);
                        // Handle the error or assign a default value
                    }
                }

                if (category.toUpperCase().equals("ICESKATING"))
                {
                    LevelString levelEnum;

                    try {
                        levelEnum = LevelString.valueOf(level);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid level: " + level);
                        levelEnum = LevelString.BEGINNER; // Example of setting a default value
                    }
                    IceSkater iceSkater=new IceSkater(name,email,age,gender,country,levelEnum);
                    iceSkater.setCompetitorNumber(competitorNumber);
                    iceSkater.setScores(scores);
                    competitorList.addCompetitor(iceSkater);


                }
                else if(category.toUpperCase().equals("ELECTRONICGAMER")){
                    int levelInt=Integer.parseInt(level);
                    LevelInteger levelInteger=this.convertIntToLevelInteger(levelInt);
                    Gamer gamer=new Gamer(name,email,age,gender,country,levelInteger);
                    gamer.setCompetitorNumber(competitorNumber);
                    gamer.setScores(scores);
                    competitorList.addCompetitor(gamer);


                }



            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Name createNameFromFullName(String fullName) {
        String[] nameParts = fullName.trim().split("\\s+");
        Name name;

        switch (nameParts.length) {
            case 1:
                // Only one name part
                name = new Name(nameParts[0]);
                break;
            case 2:
                // Two name parts
                name = new Name(nameParts[0], nameParts[1]);
                break;
            case 3:
                // Three name parts
                name = new Name(nameParts[0], nameParts[1], nameParts[2]);
                break;
            default:
                // Handle the case where there are more than three name parts
                // For example, use only the first three, or handle it as an error
                name = new Name(nameParts[0], nameParts[1], nameParts[2]);
                break;
        }

        return name;
    }

public void Print()
{
    for(Competitor competitor:competitorList.getAllCompetitors())
    {
        System.out.println(competitor.getFullDetails());

    }
}
    public LevelInteger convertIntToLevelInteger(int levelInt) {
        for (LevelInteger level : LevelInteger.values()) {
            if (level.getLevelValue() == levelInt) {
                return level;
            }
        }
        throw new IllegalArgumentException("Invalid level integer: " + levelInt);
    }

}

