package org.scalaexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication

@SpringBootApplication
class Application

object Application extends App {
  SpringApplication.run(classOf[Application]);
}