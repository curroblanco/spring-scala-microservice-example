package org.scalaexample.repository

import java.lang.Long

import org.scalaexample.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait UserRepository extends JpaRepository[User, Long] {

}

