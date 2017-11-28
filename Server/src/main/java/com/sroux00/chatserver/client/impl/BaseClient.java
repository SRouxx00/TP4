package com.sroux00.chatserver.client.impl;

import com.sroux00.chatserver.PermissionGroup;
import com.sroux00.chatserver.client.Client;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.net.Socket;

@Getter
@Setter
public class BaseClient implements Client {

    // Final data
    private final String username;
    @Getter(AccessLevel.NONE)
    private final Socket socket;
    private final long ip;

    // Dynamic data
    private PermissionGroup group = PermissionGroup.DEFAULT;

    public BaseClient(Socket socket, String username) {
        this.socket = socket;
        this.username = username;
        this.ip =
    }

    public String getAddress() {
        return null;
    }
}
