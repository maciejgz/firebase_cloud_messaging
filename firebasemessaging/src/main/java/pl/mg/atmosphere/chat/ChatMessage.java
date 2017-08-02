package pl.mg.atmosphere.chat;

import java.util.Date;

import lombok.extern.slf4j.Slf4j;


/* @Data */
@Slf4j
public class ChatMessage {

  private String message;
  private String author;
  private long time;


  public ChatMessage(String author, String message) {
    this.message = message;
    this.author = author;
    this.time = new Date().getTime();
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }


  public void sampleMethod() {
    log.debug("test");
  }

}
