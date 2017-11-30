package com.sroux00.chatserver.server;

import com.sroux00.chatserver.client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ChatServer {

    private final Map<String, Client> clients = new HashMap<>();

    public void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(3718);
            while (true) {
                Socket socket = serverSocket.accept();
                assignConnection(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

    private void assignConnection(Socket socket) {
        System.out.println("Assigning connection");
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            if ((line = in.readLine()) != null) {
                String[] handShakeValues = line.split("\\:");
                if(handShakeValues.length != 2 || handShakeValues[1].contains(" ") || handShakeValues[0].equals("PacketHandshake")) {
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println("PacketServerKick:Votre connection a ete refusé")
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            try {
                socket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

    }
}
