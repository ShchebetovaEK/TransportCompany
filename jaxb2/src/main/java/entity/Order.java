package entity;

public class Order {

    private String nameCity1;
    private double longitude1;
    private double latitude1;
    private boolean airport1;
    private boolean seaport1;
    private String nameCity2;
    private double longitude2;
    private double latitude2;
    private boolean airport2;
    private boolean seaport2;
    private String nameTransport;
    private int speed;
    private int passengers;
    private int tonnage;
    private String category;
    private int priсeKm;

    public Order(String nameCity1, double longitude1, double latitude1, boolean airport1, boolean seaport1, String nameCity2, double longitude2, double latitude2, boolean airport2, boolean seaport2, String nameTransport, int speed, int passengers, int tonnage, String category, int priсeKm) {
        this.nameCity1 = nameCity1;
        this.longitude1 = longitude1;
        this.latitude1 = latitude1;
        this.airport1 = airport1;
        this.seaport1 = seaport1;
        this.nameCity2 = nameCity2;
        this.longitude2 = longitude2;
        this.latitude2 = latitude2;
        this.airport2 = airport2;
        this.seaport2 = seaport2;
        this.nameTransport = nameTransport;
        this.speed = speed;
        this.passengers = passengers;
        this.tonnage = tonnage;
        this.category = category;
        this.priсeKm = priсeKm;
    }

    public Order(String nameCity1) {
    }

    public String getNameCity1() {
        return nameCity1;
    }

    public void setNameCity1(String nameCity1) {
        this.nameCity1 = nameCity1;
    }

    public double getLongitude1() {
        return longitude1;
    }

    public void setLongitude1(double longitude1) {
        this.longitude1 = longitude1;
    }

    public double getLatitude1() {
        return latitude1;
    }

    public void setLatitude1(double latitude1) {
        this.latitude1 = latitude1;
    }

    public boolean isAirport1() {
        return airport1;
    }

    public void setAirport1(boolean airport1) {
        this.airport1 = airport1;
    }

    public boolean isSeaport1() {
        return seaport1;
    }

    public void setSeaport1(boolean seaport1) {
        this.seaport1 = seaport1;
    }

    public String getNameCity2() {
        return nameCity2;
    }

    public void setNameCity2(String nameCity2) {
        this.nameCity2 = nameCity2;
    }

    public double getLongitude2() {
        return longitude2;
    }

    public void setLongitude2(double longitude2) {
        this.longitude2 = longitude2;
    }

    public double getLatitude2() {
        return latitude2;
    }

    public void setLatitude2(double latitude2) {
        this.latitude2 = latitude2;
    }

    public boolean isAirport2() {
        return airport2;
    }

    public void setAirport2(boolean airport2) {
        this.airport2 = airport2;
    }

    public boolean isSeaport2() {
        return seaport2;
    }

    public void setSeaport2(boolean seaport2) {
        this.seaport2 = seaport2;
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPriсeKm() {
        return priсeKm;
    }

    public void setPriсeKm(int priсeKm) {
        this.priсeKm = priсeKm;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nameCity1='" + nameCity1 + '\'' +
                ", longitude1=" + longitude1 +
                ", latitude1=" + latitude1 +
                ", airport1=" + airport1 +
                ", seaport1=" + seaport1 +
                ", nameCity2='" + nameCity2 + '\'' +
                ", longitude2=" + longitude2 +
                ", latitude2=" + latitude2 +
                ", airport2=" + airport2 +
                ", seaport2=" + seaport2 +
                ", nameTransport='" + nameTransport + '\'' +
                ", speed=" + speed +
                ", passengers=" + passengers +
                ", tonnage=" + tonnage +
                ", category='" + category + '\'' +
                ", priсeKm=" + priсeKm +
                '}';
    }
}










