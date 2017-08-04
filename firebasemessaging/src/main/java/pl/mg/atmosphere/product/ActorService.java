package pl.mg.atmosphere.product;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

  @Autowired
  ActorRepository actorRepository;

  Actor findActorById(Long id) {
    return actorRepository.findOne(id);
  }

  void addActor() {
    Actor actor = new Actor();
    actor.setFirstName("random");
    actor.setLastName("random");
    actor.setLastUpdate(new Date());
    actorRepository.save(actor);
  }
  
  
  void updateTwo(){
    Actor actor = actorRepository.findOne(2L);
    actor.setFirstName("teststst");
    actorRepository.save(actor);
  }
}
