package com.sagarannaldas.model;

public class Notification {
    private String title;
    private String subtitle;
    private String message;
    private long messageId;

    public Notification() {}

    public Notification(String title, String subtitle, String message, int messageId) {
        this.title = title;
        this.subtitle = subtitle;
        this.message = message;
        this.messageId = messageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", message='" + message + '\'' +
                ", messageId=" + messageId +
                '}';
    }
}
