package com.sroux00.chatserver.client.impl;

import com.sroux00.chatserver.permission.PermissionGroup;
import com.sroux00.chatserver.client.Client;

import java.net.Socket;

public class BaseClient implements Client {

    // Final data
    private final String username;
    private final Socket socket;
    private final long ip;

    // Dynamic data
    private PermissionGroup group = PermissionGroup.DEFAULT;

    public BaseClient(Socket socket, String username) {
        this.socket = socket;
        this.username = username;

    }

    public String getUsername() {
        return null;
    }

    public String getAddress() {
        return null;
    }

    public PermissionGroup getGroup() {
        return this.group;
    }

    public void setGroup(PermissionGroup group) {
        this.group = group;
    }
}
