package cz.uhk.album;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/albums")
public class HomeController {
    
    @GetMapping("/home")
    public String home() {
        return "Hello from 2nd microservice!";
    }
    
}
