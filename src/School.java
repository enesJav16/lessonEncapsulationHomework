public class School {
    private String name;
    private String city;
    private int rank;
    private int inopp;

    public School(){}

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

    void setCity(String city){
        this.city=city;
    }
    String getCity(){
        return city;
    }

    void setRank(int rank){
        this.rank=rank;
    }
    int getRank(){
        return rank;
    }

    void setInopp(int inopp){
        this.inopp=inopp;
    }
    int getInopp(){
        return inopp;
    }

    void printSchool(School[]a){
        for(School school:a){
            System.out.println("Name         : "+school.name+
                               "\nCity         : "+school.city+
                               "\nRank         : #"+school.rank+
                               "\nIn operation : "+school.inopp);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
    }
}
