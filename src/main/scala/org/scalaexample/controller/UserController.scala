package org.scalaexample.controller

import java.lang.Iterable

import org.scalaexample.entity.User
import org.scalaexample.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(path = Array("/api"))
class UserController(@Autowired private val userService: UserService) {

  @GetMapping(path = Array("/users"))
  def getAllUsers: Iterable[User] = {
    userService.listUsers()
  }

  @GetMapping(path = Array("/users/{id}"))
  def getUser(@PathVariable id: Long): Any = {
    userService.getUser(id)
  }

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping(path = Array("/users"))
  def createUser(@RequestBody user: User): User = {
    userService.createUser(user)
  }

  @PutMapping(path = Array("/users/{id}"))
  def modifyUser(@PathVariable id: Long, @RequestBody user: User): Any = {

    userService.modifyUser(id, user)
  }

  @DeleteMapping(path = Array("/users/{id}"))
  def deleteUser(@PathVariable id: Long): ResponseEntity[Void] = {
    userService.deleteUser(id)

    new ResponseEntity(HttpStatus.NO_CONTENT)
  }
}