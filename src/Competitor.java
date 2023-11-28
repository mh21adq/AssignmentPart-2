
public  class Competitor {
    public int getCompetitorNumber() {
        return competitorNumber;
    }

    public void setCompetitorNumber(int competitorNumber) {
        this.competitorNumber = competitorNumber;
    }

    private  int competitorNumber;
    private Name name;
    private int age;
    String gender;

    private String country;
    private String level;
    private static int lastNumber = 99;




    public Competitor(String name, int age,String gender, String country)
    {
        this.competitorNumber=lastNumber++;

        this.age=age;
        this.gender=gender;
        this.country=country;
        //this.level=level;
        String[] parts = name.split("\\s+");


        switch (parts.length) {
            case 1: // Only first name is provided
                this.name = new Name(parts[0]);
                break;
            case 2: // First and last names are provided
                this.name = new Name(parts[0], parts[1]);
                break;
            case 3: // First, middle, and last names are provided
                this.name = new Name(parts[0], parts[1], parts[2]);
                break;
            default:
                break;
        }




    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }





    public String getName() {
        return this.name.getFullName();
    }

    public void setName(Name name) {
        this.name = name;
    }

//    public String getLevel() {
//        return level;
//    }
//
//    public void setLevel(String level) {
//        this.level = level;
//    }
    public int getAge() {
   return this.age;
    }

    //Main methods starting from here
    public double getOverallScore() { return 5; }
    public String getFullDetails()
    {
       String ss= "Competitor Number:"+ this.competitorNumber+"\nName:" +this.name.getFullName()+"\nCountry:" +this.getCountry()+
            "\n"+name.getFirstName() +" is a  aged "+ this.getAge()+" and has an overall score of " +this.getOverallScore();
       return ss;
    }
    public String getShortDetails()
    {
        String ss="CN "+this.competitorNumber+ "("+name.getInitials()+")"+ " has overall score"+ this.getOverallScore();
        return ss;
    }

    public  double getOverallScore(int top)
    {
        return 0;
    }
}
