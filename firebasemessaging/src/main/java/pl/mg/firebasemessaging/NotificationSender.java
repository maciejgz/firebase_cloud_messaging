package pl.mg.firebasemessaging;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;

import de.bytefish.fcmjava.client.FcmClient;
import de.bytefish.fcmjava.client.settings.PropertiesBasedSettings;
import de.bytefish.fcmjava.model.options.FcmMessageOptions;
import de.bytefish.fcmjava.model.topics.Topic;
import de.bytefish.fcmjava.requests.topic.TopicUnicastMessage;
import de.bytefish.fcmjava.responses.TopicMessageResponse;

public class NotificationSender {

    public static void main(String[] args) {

        // sendUsingDefaultFcmLib();
        sendUsingFcmJava();
    }

    public static void sendUsingDefaultFcmLib() {
        Sender sender = new Sender(PropsUtil.getProperty("fcm.api.key"));
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
            e.printStackTrace();
        }
    }

    public static void sendUsingFcmJava() {
        FcmClient client = new FcmClient(PropertiesBasedSettings
                .createFromProperties(PropsUtil.getProps()));
        FcmMessageOptions options = FcmMessageOptions.builder().setTimeToLive(
                Duration.ofHours(1)).build();

        TopicMessageResponse response = client.send(new TopicUnicastMessage(
                options, new Topic("news"), new PersonData("Philipp",
                        "Wagner")));

        Assert.assertNotNull(response);

        // Make sure there are no errors:
        Assert.assertNotNull(response.getMessageId());
        Assert.assertNull(response.getErrorCode());

    }

}
