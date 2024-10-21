import java.time.LocalDate;
import java.time.Period;

public class University {
    private String name;
    private Period dateOfFoundation;
    private String country;
    private int rank;


    public University(){}

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

    void setDateOfFoundation(Period dateOfFoundation){
        this.dateOfFoundation=dateOfFoundation;
    }
    Period getDateOfFoundation(){
        return dateOfFoundation;
    }

    void setCountry(String  country){
        this.country=country;
    }
    String getCountry(){
        return country;
    }

    void setRank(int rank){
        this.rank=rank;
    }
    int getRank(){
        return rank;
    }

    void printUniver(University[]a){
        for(University university: a){
            System.out.println("Name               : "+university.name+
                               "\nCountry            : "+university.country+
                               "\nRank               : #"+university.rank+
                               "\nDate of foundation : "+university.dateOfFoundation);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
    }

}
