package vendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasAplication {
	
	@GetMapping("/hello")
	public String helloWorld() {
		
		return "HEllo world";
	}
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(VendasAplication.class, args);
	}

}
