package cms.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CmsDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsDiscoveryServiceApplication.class, args);
	}

}
