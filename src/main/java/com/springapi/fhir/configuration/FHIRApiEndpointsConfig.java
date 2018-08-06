package com.springapi.fhir.configuration;

import com.springapi.fhir.controllers.MedicalApiController;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ MedicalApiController.class, SwaggerConfig.class, }) //ServiceConfig.class
public class FHIRApiEndpointsConfig {}
