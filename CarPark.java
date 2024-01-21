public class CarPark {
    private int size;
    private Car[] spaces;
    private int nextEmptySpace;

    public CarPark(int size) {
        this.size = size;
        this.spaces = new Car[size];
        this.nextEmptySpace = 0;
    }

    public int park(Car car) {
        if (nextEmptySpace < size) {
            spaces[nextEmptySpace] = car;
            int occupiedSpaceNumber = nextEmptySpace + 1;
            nextEmptySpace++;
            return occupiedSpaceNumber;
        } else {
            // Car park is full
            return -1;
        }
    }

    public int search(LicensePlate lp) {
        for (int i = 0; i < nextEmptySpace; i++) {
            Car car = spaces[i];
            if (car != null && car.getLicensePlate().isEqual(lp)) {
                return i + 1; // Return the occupied space number
            }
        }
        // Car with the given license plate not found
        return -1;
    }

    public Car driveOff(LicensePlate lp) {
        int spaceNumber = search(lp);
        if (spaceNumber != -1) {
            Car removedCar = spaces[spaceNumber - 1];
            spaces[spaceNumber - 1] = null; // Remove the car from the space
            return removedCar;
        } else {
            // Car with the given license plate not found
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Car Park:\n");
        for (int i = 0; i < size; i++) {
            result.append(i + 1).append(": ");
            if (spaces[i] != null) {
                result.append("[")
                        .append(spaces[i].toString())
                        .append("]\n");
            } else {
                result.append("[]\n");
            }
        }
        return result.toString();
    }
}
