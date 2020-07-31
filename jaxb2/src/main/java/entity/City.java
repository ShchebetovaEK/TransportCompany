package entity;
import java.util.Objects;

public class City {
    private int id;
    private String name;
    private double longitude;
    private double latitude;
    private boolean airport;
    private boolean seaport;

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public City(int id, String name, double longitude, double latitude, boolean airport, boolean seaport) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.airport = airport;
        this.seaport = seaport;
    }

    public City() {
    }

    public City(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public boolean isAirport() {
        return airport;
    }

    public void setAirport(boolean airport) {
        this.airport = airport;
    }

    public boolean isSeaport() {
        return seaport;
    }

    public void setSeaport(boolean seaport) {
        this.seaport = seaport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city  = (City) o;
        return id == city.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", airport=" + airport +
                ", seaport=" + seaport +
                '}';
    }
}
