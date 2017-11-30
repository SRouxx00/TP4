package com.sroux00.chatclient.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {

    private final Socket socket;

    public Client(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter(this.socket.getOutputStream(), true);
            while (true) {
                try {
                    Thread.sleep(100);
                    if(socket.isConnected()) {
                        pw.println("Fuckcs");
                        System.out.println("Sent Data");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
