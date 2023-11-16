package cpen221.mp3.entity;

import cpen221.mp3.event.Event;

public class Sensor implements Entity {
    private final int id;
    private final int clientId;
    private final String type;

    public Sensor(int id, int clientId, String type) {
        this.id = id;
        this.clientId = clientId;
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

    public void sendEvent(Event event, String host, int port) {
        // implement this method

        // note that Event is a complex object that you need to serialize before sending
    }
}