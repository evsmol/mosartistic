package com.onesignal;

public class OSInAppMessage {
    protected String messageId;

    OSInAppMessage(String str) {
        this.messageId = str;
    }

    public String getMessageId() {
        return this.messageId;
    }
}
