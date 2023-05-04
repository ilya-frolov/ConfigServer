package studying.springcloudconfigserverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloApp.class, args);
	}

}
