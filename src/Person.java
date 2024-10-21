public class Person {
    private String name;
    private String surname;
    private int age;
    private String nationality;

    public Person(){}

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return nationality;
    }

    void printPerson(Person[]a){
        for(Person person:a){
            System.out.println("Full name   : "+person.name+" "+person.surname+
                               "\nAge         : "+person.age+
                               "\nNationality : "+person.nationality);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
    }

}
