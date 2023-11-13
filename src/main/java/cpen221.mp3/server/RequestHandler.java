package cpen221.mp3.server;

import java.net.ServerSocket;
import java.net.Socket;

public class RequestHandler {
    private ServerSocket serverSocket;
    private int port;

    public RequestHandler(int port) {
        this.port = port;
    }

    public void start() {
        // the following is just one way of starting the handler
        // you may need to change it to fit your implementation
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                // create a new thread to handle the client request
                Thread handlerThread = new Thread(new RequestHandlerThread(clientSocket));
                handlerThread.start();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // you would need to initialize the RequestHandler with the port number
        // and then start it here
    }
}

class RequestHandlerThread implements Runnable {
    private Socket clientSocket;

    public RequestHandlerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        // handle the client request here
        // and deal with exceptions if needed
    }
}
