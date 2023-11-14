package cpen221.mp3.entity;

public class Sensor implements Entity {
    private final int id;
    private final String type;

    public Sensor(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public boolean isActuator() {
        return false;
    }
}