public class Plane {
    public String mark;
    public double volume;
    public int maxDistance;

    public Plane(String mark, double volume, int maxDistance) {
        this.mark = mark;
        this.volume = volume;
        this.maxDistance = maxDistance;
    }

    public String getMark() {
        return mark;
    }

    public double getVolume() {
        return volume;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
