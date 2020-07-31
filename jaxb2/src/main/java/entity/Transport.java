package entity;

public   class Transport {
    private int id;
    private String name;
    private int speed;
    private int passengers;
    private int tonnage;
    private String category;
    private int priсeKm;

    public Transport() {
    }

    public Transport(int id, String name, int speed, int passengers, int tonnage, String category, int priсeKm) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.passengers = passengers;
        this.tonnage = tonnage;
        this.category = category;
        this.priсeKm = priсeKm;
    }

    public Transport(int id, String name, int speed, int passengers, int tonnage, int priсeKm) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.passengers = passengers;
        this.tonnage = tonnage;
        this.priсeKm = priсeKm;
    }

    public Transport(int id) {
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

    public  String getCategory() {
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
        return "Transport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", passengers=" + passengers +
                ", tonnage=" + tonnage +
                ", category='" + category + '\'' +
                ", priсeKm=" + priсeKm +
                '}';
    }

    public void add(Transport transport) {
    }
}
