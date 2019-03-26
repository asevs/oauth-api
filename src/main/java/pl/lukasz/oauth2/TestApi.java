package pl.lukasz.oauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping(value = "/api/say")
    public String Say(){
        return "I say!";
    }
}
