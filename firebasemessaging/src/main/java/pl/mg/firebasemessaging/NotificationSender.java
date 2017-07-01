package pl.mg.firebasemessaging;

import java.io.IOException;

public class NotificationSender {

    public static String SERVER_KEY = "AAAALMnVjnM:APA91bFxr2uJbwlWjh-QKM4ewCSYBKeOqOI1fdYbgfPI3mrF4eY7szsuit1up8g9otYHZb8-AgvYeLHNs6jnDmTLBA8vlPr5YvI8rPJYQjaaBp8dIRA-hu1KUKYGmI5uCA4s-c3I35oz";

    public static void main(String[] args) {

        Sender sender = new Sender(SERVER_KEY);
        Message message = new Message.Builder().priority(Message.Priority.HIGH)
                .contentAvailable(true).collapseKey("108").delayWhileIdle(true)
                .timeToLive(42).dryRun(true).restrictedPackageName(
                        "package.name").addData("k1", "old value").addData("k1",
                                "v1").addData("k2", "v2").notification(
                                        new Notification.Builder("my").build())
                .build();
        try {
            sender.send(message, "ja", 0);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
