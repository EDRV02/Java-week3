package QA;

public class Car {
    private String model;
    private int year;
    private String manufacturer;

    public Car(String model, int year, String manufacturer){
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
    }
    public Car(String model, String manufacturer) {
       this(model, 2024, manufacturer);

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
