package org.scalaexample.entity

import java.beans.BeanProperty
import java.io.Serializable
import java.lang.Long

import javax.persistence._
import lombok.{Getter, NoArgsConstructor, Setter}

@Entity
@Getter
@Setter
@NoArgsConstructor
class User extends Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id: Long = _

  @BeanProperty
  var username: String = _

  @BeanProperty
  var password: String = _

  @BeanProperty
  var enabled: Boolean = _

}