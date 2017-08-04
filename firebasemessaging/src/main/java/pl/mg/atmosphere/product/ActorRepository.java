package pl.mg.atmosphere.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActorRepository extends CrudRepository<Actor, Long> {

}
