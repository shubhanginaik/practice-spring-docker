package org.example;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

  @GetMapping("/get")
  public List<SoftwareEngineer> softwareEngineers(){
    return List.of(
        new SoftwareEngineer(1, "Alice", "Java, js, node"),
        new SoftwareEngineer(2, "Bob", "Python, Django"),
        new SoftwareEngineer(3, "Charlie", "C++, Qt")
    );
  }

}
