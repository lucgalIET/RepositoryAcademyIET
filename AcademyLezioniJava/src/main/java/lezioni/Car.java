package lezioni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car> {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car otherCar) {
        // Compara le auto in base all'anno in ordine decrescente
        // Restituisce un numero negativo se this < otherCar
        // Restituisce zero se this == otherCar
        // Restituisce un numero positivo se this > otherCar

        // Ordinamento in ordine decrescente per anno
        return otherCar.year - this.year;
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2010));
        cars.add(new Car("Honda", 2015));
        cars.add(new Car("Ford", 2005));

        // Ordina le auto in base all'anno
        Collections.sort(cars);

        Car cara = new Car("BatMobile", 1960);
        System.out.println(cara.compareTo(cars.get(0)));

        // Stampa le auto in ordine decrescente per anno
//        for (Car car : cars) {
//            System.out.println(car.getBrand() + " - " + car.getYear());
//        }
    }
}

