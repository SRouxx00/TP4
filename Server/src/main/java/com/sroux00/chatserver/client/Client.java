package com.sroux00.chatserver.client;

import com.sroux00.chatserver.permission.PermissionGroup;

public interface Client {

    String getUsername();

    String getAddress();

    PermissionGroup getGroup();

    void setGroup(PermissionGroup group);
}
