package com.sroux00.chatserver.client.impl;

import com.sroux00.chatserver.permission.PermissionGroup;
import com.sroux00.chatserver.client.Client;

import java.net.Socket;

public class BasicClient implements Client, Runnable {

    // Final data
    private final String username;
    private final Socket socket;

    // Dynamic data
    private PermissionGroup group = PermissionGroup.DEFAULT;

    public BasicClient(Socket socket, String username) {
        this.socket = socket;
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public String getAddress() {
        return this.socket.getInetAddress().getHostAddress();
    }

    public PermissionGroup getGroup() {
        return this.group;
    }

    public void setGroup(PermissionGroup group) {
        this.group = group;
    }

    @Override
    public void run() {

    }
}
