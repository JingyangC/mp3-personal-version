package cpen221.mp3.handler;

import java.net.Socket;

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