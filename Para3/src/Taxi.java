public class Taxi extends Auto{
    private String driver;
    private int pricekm;

    public Taxi(String marka, String number, String vin, int year, double vol, int price, int km,
                String driver, int pricekm) {
        super(marka, number, vin, year, vol, price, km);
        this.driver = driver;
        this.pricekm = pricekm;
    }
    double stoim(double km) {
        return km * pricekm;
    }

    public String getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "driver='" + driver + '\'' +
                ", pricekm=" + pricekm +
                '}';
    }
}
