package com.sroux00.chatserver.client;

import com.sroux00.chatserver.PermissionGroup;

public interface Client {

    String getUsername();

    String getAddress();

    PermissionGroup getGroup();

    void setGroup(PermissionGroup group);
}
