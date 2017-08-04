package pl.mg.atmosphere.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "actor")
public class Actor {

  @Id
  @Column(name = "actor_id")
  private long actorId;

  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;


  @Column(name = "last_update")
  @Temporal(TemporalType.TIMESTAMP)
  private java.util.Date lastUpdate;

  public long getActorId() {
    return actorId;
  }

  public void setActorId(long actorId) {
    this.actorId = actorId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public java.util.Date getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.util.Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


}
