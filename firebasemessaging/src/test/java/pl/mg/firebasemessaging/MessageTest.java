package pl.mg.firebasemessaging;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageTest {

    
    @Test
    public void testRequiredParameters() {
      Message message = new Message.Builder().build();
      assertNull(message.getCollapseKey());
      assertNull(message.isDelayWhileIdle());
      assertTrue(message.getData().isEmpty());
      assertNull(message.getTimeToLive());
      assertNull(message.getNotification());
      String toString = message.toString();
      assertFalse(toString.contains("collapseKey"));
      assertFalse(toString.contains("timeToLive"));
      assertFalse(toString.contains("delayWhileIdle"));
      assertFalse(toString.contains("data"));
    }
}
