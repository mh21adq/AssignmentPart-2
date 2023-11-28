
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Manager {
    private CompetitorList competitorList;

    public Manager() {
        this.competitorList = new CompetitorList();
    }

    // Method to read competitors from a file



    public void readFromFile(String fname)
    {
        try
        {
            File file=new File(fname);
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;

            while((line=bufferedReader.readLine())!=null)
            {
                String[] data=line.split(",");
                int competitorNumber = Integer.parseInt(data[0]);
                String fullName=data[1];
                int age = Integer.parseInt(data[2]);
                String gender=data[3];
                String country=data[4];
                Competitor comp=new Competitor(fullName,age,gender,country);
                comp.setCompetitorNumber(competitorNumber);
                competitorList.addCompetitor(comp);

               //System.out.print(comp.getCompetitorNumber());




            }
            bufferedReader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }





}

