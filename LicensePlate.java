public class LicensePlate {
    private String regionalCode;
    private String letters;
    private int digits;

    public LicensePlate(String regionalCode, String letters, int digits) {
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
    }

    public boolean isEqual(LicensePlate other) {
        return this.regionalCode.equals(other.regionalCode)
                && this.letters.equals(other.letters)
                && this.digits == other.digits;
    }

    @Override
    public String toString() {
        return "LicensePlate: " + regionalCode + ":" + letters + " " + digits;
    }
}
