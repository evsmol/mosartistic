package com.onesignal;

public class OSNotificationAction {
    private final String actionId;
    private final ActionType type;

    public enum ActionType {
        Opened,
        ActionTaken
    }

    public OSNotificationAction(ActionType actionType, String str) {
        this.type = actionType;
        this.actionId = str;
    }
}
