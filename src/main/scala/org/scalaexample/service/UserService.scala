package org.scalaexample.service

import java.lang.Iterable

import org.scalaexample.entity.User
import org.scalaexample.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

  def listUsers(): Iterable[User] = {
    userRepository.findAll
  }

  def getUser(id: Long): Any = {
    userRepository.findById(id)
  }

  def createUser(user: User): User = {
    userRepository.save(user)
  }

  def modifyUser(id: Long, user: User): User = {
    userRepository.findById(id)

    user.id = id
    userRepository.save(user)
  }

  def deleteUser(id: Long): Unit = {
    val user = userRepository.findById(id)

    userRepository.delete(user.get())
  }

}