package assignmentsinjava;

// Base class: Vehicle
class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

// Subclass: Car (inherits from Vehicle)
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("MAHINDRA", 120);
        vehicle.displayDetails();

        System.out.println(); // Just for spacing

        Car car = new Car("TATA", 150, 4);
        car.displayDetails();
    }
}
