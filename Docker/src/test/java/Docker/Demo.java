package Docker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

  @GetMapping("/greet/{name}")
  public String greeting(@PathVariable String name) {
    return "Hi!! " + name;
  }
}