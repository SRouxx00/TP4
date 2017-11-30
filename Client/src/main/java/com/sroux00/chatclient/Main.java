package com.sroux00.chatclient;

import com.sroux00.chatclient.client.Client;
import com.sroux00.chatclient.client.ClientReceiver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 3718);
        new Thread(new Client(socket)).start();
        new Thread(new ClientReceiver(socket)).start();
    }
}
