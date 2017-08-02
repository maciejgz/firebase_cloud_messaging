package pl.mg.atmosphere.chat;

import java.io.IOException;

import javax.inject.Inject;

import org.atmosphere.config.managed.Encoder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonEncoder implements Encoder<ChatMessage, String> {
  @Inject
  private ObjectMapper mapper;

  @Override
  public String encode(ChatMessage m) {
    try {
      return mapper.writeValueAsString(m);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
