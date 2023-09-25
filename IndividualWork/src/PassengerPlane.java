public class PassengerPlane extends Plane{
    private int countOfPlace;

    public PassengerPlane(String mark, double volume, int maxDistance, int countOfPlace) {
        super(mark, volume, maxDistance);
        this.countOfPlace = countOfPlace;
    }

    public void changeCountOfPlaces(int n) {
        countOfPlace = n;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "countOfPlace=" + countOfPlace +
                ", mark='" + mark + '\'' +
                ", volume=" + volume +
                ", maxDistance=" + maxDistance +
                '}';
    }
}
