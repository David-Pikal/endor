package cz.uhk.album;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/albums")
public class HomeController {
    
    @GetMapping("/home")
    public String home() {
        log.info("Hit home endpoint in Album microservice!");
        return "Hello from 2nd microservice!";
    }

    @GetMapping("/bullshit")
    public Mono<String> bullshit() {
        log.info("Bullshit endpoint reached!");
        return Mono.just("bullshit 2");
    }
    
}
