package com.springapi.fhir;

import com.springapi.fhir.configuration.FHIRApiEndpointsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({FHIRApiEndpointsConfig.class})
public class SpringFhirApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFhirApplication.class, args);
	}
}
