package com.java.factorymethd;

interface Notification {

    // Contract method
    void notifyUser(String message);

    // Default method: shared behavior for all notifications
    default void logNotification(String type, String message) {
        System.out.println("[LOG] Notification Type: " + type + " | Message: " + message);
    }

    // Private static helper: reusable formatting logic
    private static String formatMessage(String message) {
        return "** " + message + " **";
    }

    // Static method to format message outside instance
    static String format(String message) {
        return formatMessage(message);
    }
}

class NotificationFactoryClass {

    public static Notification getNotification(String notify) {
        switch (notify.toLowerCase()) {

            case "email" -> {
                return new Notification() {
                    @Override
                    public void notifyUser(String message) {
                        String formatted = Notification.format(message);  // use interface static helper
                        System.out.println("Email sent: " + formatted);
                        logNotification("Email", message);                // use default method
                    }
                };
            }

            case "insta" -> {
                return new Notification() {
                    @Override
                    public void notifyUser(String message) {
                        String formatted = Notification.format(message);
                        System.out.println("Instagram DM sent: " + formatted);
                        logNotification("Instagram", message);
                    }
                };
            }

            default -> throw new IllegalArgumentException("Unexpected value: " + notify);
        }
    }
}


public class NotificationFactory {
    public static void main(String[] args) {
        Notification email = NotificationFactoryClass.getNotification("email");
        email.notifyUser("Your order has been shipped");

        Notification insta = NotificationFactoryClass.getNotification("insta");
        insta.notifyUser("Your story was liked");
    }
}

