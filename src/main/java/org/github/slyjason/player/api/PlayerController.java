package org.github.slyjason.player.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.github.slyjason.player.model.*;


@RestController
public class PlayerController {
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    return new Greeting(counter.incrementAndGet(),
      String.format(template, name));
  }

  @SpringBootApplication
  public static class Application {

    public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
    }
  }
}


