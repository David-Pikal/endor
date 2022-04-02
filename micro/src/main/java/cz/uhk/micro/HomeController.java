package cz.uhk.micro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/micro")
public class HomeController {

    @GetMapping(value="/home")
    public String home() {
        return "Home!";
    }
    
}
