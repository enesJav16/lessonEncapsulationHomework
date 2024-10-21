import java.time.LocalDate;
import java.time.Period;

public class Car {
    private String model;
    private String brand;
    private Period startOfProduction;
    private int price;

    public Car(){}

    void setModel(String  model){
        this.model=model;
    }
    String getModel(){
        return model;
    }

    void setBrand(String brand){
        this.brand=brand;
    }
    String getBrand(){
        return brand;
    }

    void setStartOfProduction(Period startOfProduction){
        this.startOfProduction=startOfProduction;
    }
    Period getStartOfProduction(){
        return startOfProduction;
    }

    void setPrice(int price){
        this.price=price;
    }
    int getPrice(){
        return price;
    }

    void printCar(Car []a){
        for(Car car:a){
            System.out.println("Brand               : "+car.brand+
                               "\nModel               : "+car.model+
                               "\nStart of production :"+car.startOfProduction+
                               "\nPrice               : "+car.price+"$");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
    }
}
