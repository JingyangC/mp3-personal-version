package cpen221.mp3.entity;

import cpen221.mp3.event.Event;

public class Actuator implements Entity {
    private final int id;
    private int clientId;
    private final String type;
    private boolean state;

    public Actuator(int id, String type, boolean init_state) {
        this.id = id;
        this.clientId = -1;         // remains unregistered
        this.type = type;
        this.state = init_state;
    }

    public Actuator(int id, int clientId, String type, boolean init_state) {
        this.id = id;
        this.clientId = clientId;   // registered for the client
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

    /**
     * Registers the sensor for the given client
     *
     * @return true if the sensor is new (clientID is -1 already) and gets successfully registered, false if the sensor is already registered (clientID is not -1)
     */
    public boolean registerForClient(int clientId) {
        // implement this method
        return false;
    }

    public void sendEvent(Event event, String host, int port) {
        // implement this method

        // note that Event is a complex object that you need to serialize before sending
    }
}