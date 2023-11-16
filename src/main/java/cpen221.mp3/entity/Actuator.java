package cpen221.mp3.entity;

import cpen221.mp3.event.Event;

public class Actuator implements Entity {
    private final int id;
    private final int clientId;
    private final String type;
    private boolean state;

    public Actuator(int id, int clientId, String type, boolean init_state) {
        this.id = id;
        this.clientId = clientId;
        this.type = type;
        this.state = init_state;
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
        return true;
    }

    public boolean getState() {
        return state;
    }

    public void updateState(boolean new_state) {
        this.state = new_state;
    }

    public void sendEvent(Event event, String host, int port) {
        // implement this method

        // note that Event is a complex object that you need to serialize before sending
    }
}