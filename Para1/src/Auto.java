public class Auto {
    public String marka;
    public String number;
    public String vin;
    public int year;
    public double vol;
    public int price;
    public int km;

    public Auto(String marka, String number, String vin, int year, double vol, int price, int km) {
        this.marka = marka;
        this.number = number;
        this.vin = vin;
        this.year = year;
        this.vol = vol;
        this.price = price;
        this.km = km;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", number='" + number + '\'' +
                ", vin='" + vin + '\'' +
                ", year=" + year +
                ", vol=" + vol +
                ", price=" + price +
                ", km=" + km +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public String getNumber() {
        return number;
    }

    public String getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public double getVol() {
        return vol;
    }

    public int getPrice() {
        return price;
    }

    public int getKm() {
        return km;
    }
}