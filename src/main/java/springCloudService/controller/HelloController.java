package springCloudService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController{
	@Autowired
	private Registration reigistry;
	
	@GetMapping("/helloservice")
	public String helloService() {
		log.warn("warning");
		return "hello" + "--port--" + reigistry.getPort();
	}

}
