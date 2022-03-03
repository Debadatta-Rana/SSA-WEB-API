package in.Papu.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.Papu.Service.SsnService;

@RestController 
public class SsnRestController {
	@Autowired
	private SsnService service;
	
	@GetMapping("/state/{ssn}")
	 public ResponseEntity<String> stateName(@PathVariable  String ssn){
		String stateName = service.fetchStateName(ssn);
		
		
		 return new ResponseEntity<>(stateName, HttpStatus.OK);
	 }

}
