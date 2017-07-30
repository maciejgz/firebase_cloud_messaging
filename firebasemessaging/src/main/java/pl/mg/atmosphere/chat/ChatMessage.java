package pl.mg.atmosphere.chat;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Data
@lombok.AllArgsConstructor
@Slf4j
public class ChatMessage {

  private String message;
  private String author;
  private long time;

}
