package api;

import java.util.concurrent.atomic.AtomicLong;

import model.Player;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Greeting;


@RestController
public class PlayerController {
  private static final Logger LOG = LoggerFactory.getLogger(PlayerController.class);

  @RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
  public Player getPlayer(@PathVariable(value="id") final int id) {
    LOG.info("Incoming player id is: {}", id);
    return new Player(id, "Lebron James", "Cavs");
  }
}


