package ths.helloworld.thsspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RestController
@SpringBootApplication
@RequestMapping("/rest/docker/hello")
public class ThsSpringbootApplication {
	 
	@GetMapping
	public String hello () {
        return "Hello THS GATEWAY sample";  
	}

	public static void main(String[] args) {
		SpringApplication.run(ThsSpringbootApplication.class, args);
	}
	
	}






// 	public static void main(String[] args) {
// 		SpringApplication.run(ThsSpringbootApplication.class, args);
// 	}

// }
