package pl.mg.atmosphere.chat;

import java.io.IOException;

import javax.inject.Inject;

import org.atmosphere.config.managed.Decoder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDecoder implements Decoder<String, ChatMessage> {
  @Inject
  private ObjectMapper mapper;

  @Override
  public ChatMessage decode(String s) {
    try {
      return mapper.readValue(s, ChatMessage.class);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
