import java.time.Period;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        University university1=new University();
        University university2=new University();
        University university3=new University();
        University universityP=new University();

        university1.setName("Harvard University");
        university1.setDateOfFoundation(Period.ofYears(1636));
        university1.setCountry("USA");
        university1.setRank(4);

        university2.setName("University of Cambridge");
        university2.setDateOfFoundation(Period.ofYears(1209));
        university2.setCountry("UK");
        university2.setRank(2);

        university3.setName("Stanford University");
        university3.setDateOfFoundation(Period.ofYears(1885));
        university3.setCountry("USA");
        university3.setRank(3);

        University[]universities={university1,university2,university3};



        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car carP=new Car();

        car1.setBrand("TESLA");
        car1.setModel("Model 3");
        car1.setStartOfProduction(Period.ofYears(2017));
        car1.setPrice(40240);

        car2.setBrand("TOYOTA");
        car2.setModel("Corolla");
        car2.setStartOfProduction(Period.ofYears(1966));
        car2.setPrice(21900);

        car3.setBrand("FORD");
        car3.setModel("F-150");
        car3.setStartOfProduction(Period.ofYears(1948));
        car3.setPrice(35830);

        Car [] cars={car1,car2,car3};

        School school1=new School();
        School school2=new School();
        School school3=new School();
        School schoolP=new School();

        school1.setName("Phillips Academy Andover");
        school1.setCity("Andover, Massachusetts");
        school1.setInopp(246);
        school1.setRank(1);

        school2.setName("The Lawrenceville School");
        school2.setCity(" Lawrenceville, New Jersey");
        school2.setInopp(214);
        school2.setRank(2);

        school3.setName("Choate Rosemary Hall");
        school3.setCity("Wallingford, Connecticut");
        school3.setInopp(134);
        school3.setRank(3);

        School[]schools={school1,school2,school3};



        Person person1 =new Person();
        Person person2 =new Person();
        Person person3 =new Person();
        Person personP =new Person();


        person1.setName("Elon");
        person1.setSurname("Musk");
        person1.setAge(52);
        person1.setNationality("South African, American, Canadian");

        person2.setName("Emma");
        person2.setSurname("Watson");
        person2.setAge(33);
        person2.setNationality("British");

        person3.setName("Lionel");
        person3.setSurname("Messi");
        person3.setAge(37);
        person3.setNationality("SArgentine");

        Person[]persons={person1,person2,person3};


        System.out.println("===============UNIVERSITIES===============");
        universityP.printUniver(universities);
        System.out.println("===========================================");
        System.out.println("================SCHOOLS===============\n");
        schoolP.printSchool(schools);
        System.out.println("===========================================");
        System.out.println("===================PERSONS=================\n");
        personP.printPerson(persons);
        System.out.println("===========================================");
        System.out.println("======================CARS==================\n");
        carP.printCar(cars);


    }
}