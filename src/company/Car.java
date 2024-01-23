package company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = Boolean.TRUE;
        this.wheels = 4;
    }

    public String startEngine() {
        printSimpleName();
        return "the car's engine is starting";
    }

    public String accelerate() {
        printSimpleName();
        return "the car is accelerating";
    }

    public String brake() {
        printSimpleName();
        return "the car is braking";
    }

    private void printSimpleName() {
        System.out.println("Class name: " + getClass().getSimpleName());
    }


    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinders;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinder=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
