package pl.mg.atmosphere.chat.config;

import org.atmosphere.annotation.Processor;
import org.atmosphere.config.AtmosphereAnnotation;
import org.atmosphere.cpr.AtmosphereFramework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@AtmosphereAnnotation(Config.class)
public class SampleConfig implements Processor<Object> {

  @Override
  public void handle(AtmosphereFramework framework, Class<Object> annotatedClass) {
    log.info("Custom annotation {} discovered. Starting the Chat Sample", annotatedClass.getAnnotation(Config.class));
  }
}
