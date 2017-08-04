package pl.mg.atmosphere.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

  @Autowired
  ActorRepository actorRepository;

  Actor findActorById(Long id) {
    return actorRepository.findOne(id);
  }
}
