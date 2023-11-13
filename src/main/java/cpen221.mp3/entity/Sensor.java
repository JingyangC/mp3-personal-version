package cpen221.mp3.entity;

public class Sensor implements Entity {
    private int id;
    private String type;

    public Sensor(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }
}