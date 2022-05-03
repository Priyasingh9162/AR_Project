package priya.in.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
@GetMapping("/ssl/{code}")
	public String getSSL(@PathVariable String code) {
		if(code.startsWith("6"))
			return "New Jersey";
		else if(code.startsWith("4"))
			return "New York";
		else if(code.startsWith("3"))
			return "London";
		else
			return "Invalid Code";
		
	}
	
	
}
