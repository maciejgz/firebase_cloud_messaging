package pl.mg.atmosphere.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActorController {
  @Autowired
  ActorService actorService;


  @RequestMapping("/actor")
  @ResponseBody
  public String test() {
    return actorService.findActorById(1L).getFirstName();
  }


  @RequestMapping("/actor_add_simple")
  @ResponseBody
  public String addActor() {
    actorService.addActor();
    return "ok";
  }


  @RequestMapping("/actor_update")
  @ResponseBody
  public String updateActor() {
    actorService.updateTwo();
    return "ok";
  }
}
