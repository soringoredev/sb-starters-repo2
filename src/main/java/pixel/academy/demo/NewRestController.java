package pixel.academy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {


    @GetMapping("/")
    public String hello() {
        return "Hello Africa22222222222!";
    }


}
