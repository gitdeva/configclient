package com.cloudconfig.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Autowired
	public void setEnv(Environment e)
	{
		System.out.println(e.getProperty("user.role"));
	}
}

@RefreshScope
@RestController
class ClientController {
	@Value("${user.role:Config server is not working}")
	private String userRole;

	@GetMapping("/userRoles")
	public String getUserRole(){
		return this.userRole;
	}
}
