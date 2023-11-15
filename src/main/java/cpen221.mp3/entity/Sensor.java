package cpen221.mp3.entity;

public class Sensor implements Entity {
    private final int id;
    private final int clientId;
    private final String type;

    public Sensor(int id, int clientId, String type) {
        this.id = id;
        this.clientId = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public String getType() {
        return type;
    }

    public boolean isActuator() {
        return false;
    }
}