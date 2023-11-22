package aizatejetask1;

import java.time.LocalDate;
import java.util.Locale;

public class Car {
    private String model;
    private LocalDate yearOfFoundation;
    private double price;

    public Car() {
    }

    public Car(String model, LocalDate yearOfFoundation, double price) {
        this.model = model;
        this.yearOfFoundation = yearOfFoundation;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(LocalDate yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", price=" + price +
                '}';
    }
}
