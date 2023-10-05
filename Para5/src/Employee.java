public abstract class Employee {
    private String FIO;
    private int age;
    private String number;
    private String gender;
    private int cellery;

    public int getCellery() {
        return cellery;
    }

    public void setCellery(int cellery) {
        this.cellery = cellery;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    abstract void print();
}
