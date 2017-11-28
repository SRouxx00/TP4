package com.sroux00.chatserver;

public enum PermissionGroup {

    DEFAULT(0, ""),
    ADMIN(1, "[Admin]");

    public int groupID;
    public String title;
    PermissionGroup(int groupID, String title) {
        this.groupID = groupID;
        this.title = title;
    }
}
