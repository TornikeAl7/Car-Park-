public class Car {
    private String brand;
    private LicensePlate licensePlate;
    private int chassisNumber;
    private static int count = 1; // Counter for chassisNumber

    public Car(String brand, LicensePlate licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.chassisNumber = count++;
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Car " + chassisNumber + ": (Brand: " + brand + ", License Plate: " + licensePlate + ")";
    }
}
