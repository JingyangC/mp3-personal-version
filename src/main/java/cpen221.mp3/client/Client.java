package cpen221.mp3.client;

import cpen221.mp3.request.Request;

public class Client {
    // You can add additional private fields and methods to this class if you wish

    private final int clientId;
    private String email;
    private String host;
    private int port;

    public Client(int clientId, String email, String host, int port) {
        this.clientId = clientId;
        this.email = email;
        this.host = host;
        this.port = port;
    }

    // sends a request to the given host and port
    public void sendRequest(Request request, String host, int port) {
        // implement this method

        // note that Request is a complex object that you need to serialize before sending
    }

}
