package cpen221.mp3.entity;

import cpen221.mp3.event.Event;

public class Actuator implements Entity {
    private final int id;
    private int clientId;
    private final String type;
    private String host = null;
    private int port = 0;
    private boolean state;
    private double eventGenerationFrequency = 0.2; // default value in Hz (1/s)

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

    public Actuator(int id, String type, boolean init_state, String host, int port) {
        this.id = id;
        this.clientId = -1;         // remains unregistered
        this.type = type;
        this.state = init_state;
        this.host = host;
        this.port = port;
    }

    public Actuator(int id, int clientId, String type, boolean init_state, String host, int port) {
        this.id = id;
        this.clientId = clientId;   // registered for the client
        this.type = type;
        this.state = init_state;
        this.host = host;
        this.port = port;
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

    /**
     * Sets or updates the http endpoint of the sensor
     *
     * @param host the host name of the endpoint
     * @param port the port number of the endpoint
     */
    public void setEndpoint(String host, int port){
        this.host = host;
        this.port = port;
    }

    /**
     * Sets the frequency of event generation
     *
     * @param frequency the frequency of event generation in Hz (1/s)
     */
    public void setEventGenerationFrequency(double frequency){
        // implement this method
    }

    public void sendEvent(Event event) {
        // implement this method

        // note that Event is a complex object that you need to serialize before sending
    }
}