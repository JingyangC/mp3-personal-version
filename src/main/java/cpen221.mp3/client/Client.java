package cpen221.mp3.client;

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

}
