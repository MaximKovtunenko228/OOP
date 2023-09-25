public class Main {
    public static void main(String[] args) {
        PassengerPlane pl = new PassengerPlane("T34", 15, 150, 64);
        System.out.println(pl.toString());
        pl.changeCountOfPlaces(228);
        System.out.println(pl.toString());
    }
}