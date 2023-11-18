package cpen221.mp3.handler;

import java.net.Socket;

class MessageHandlerThread implements Runnable {
    private Socket clientSocket;

    public MessageHandlerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        // handle the client request here
        // and deal with exceptions if needed
    }
}