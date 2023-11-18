package cpen221.mp3.entity;

import cpen221.mp3.event.Event;

public class Sensor implements Entity {
    private final int id;
    private int clientId;
    private final String type;
    private String host = null;
    private int port = 0;
    private double eventGenerationFrequency = 0.2; // default value in Hz (1/s)

    public Sensor(int id, String type) {
        this.id = id;
        this.clientId = -1;         // remains unregistered
        this.type = type;
    }

    public Sensor(int id, int clientId, String type) {
        this.id = id;
        this.clientId = clientId;   // registered for the client
        this.type = type;
    }

    public Sensor(int id, String type, String host, int port) {
        this.id = id;
        this.clientId = -1;   // remains unregistered
        this.type = type;
        this.host = host;
        this.port = port;
    }

    public Sensor(int id, int clientId, String type, String host, int port) {
        this.id = id;
        this.clientId = clientId;   // registered for the client
        this.type = type;
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
        return false;
    }

    /**
     * Registers the sensor for the given client
     *
     * @return true if the sensor is new (clientID is -1 already) and gets successfully registered or if it is already registered for clientId, else false
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