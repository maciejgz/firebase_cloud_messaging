package pl.mg.atmosphere.chat;

import java.lang.reflect.Type;

import org.atmosphere.cpr.AtmosphereConfig;
import org.atmosphere.inject.Injectable;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperInjectable implements Injectable<ObjectMapper> {

  private final ObjectMapper mapper = new ObjectMapper();

  @SuppressWarnings("rawtypes")
  @Override
  public boolean supportedType(Type t) {
      return (t instanceof Class) && ObjectMapper.class.equals((Class) t);
  }

  @Override

  public ObjectMapper injectable(AtmosphereConfig config) {
      return mapper;
  }
}
