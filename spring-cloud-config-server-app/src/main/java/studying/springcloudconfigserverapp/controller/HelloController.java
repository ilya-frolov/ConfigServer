package studying.springcloudconfigserverapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Value("${message: Hello default}")
    String message;

    @GetMapping(value = "/message")
    public String helloWorld() {
        return this.message;
    }
}
