package com.springapi.fhir.controllers;

import com.springapi.fhir.models.MedicalEntry;
import com.springapi.fhir.models.PatientMedicalEntry;
import com.springapi.fhir.services.MedicalService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Configuration
@Controller
@RequestMapping("/patient")
@Api(value = "patient", description = "the patient API request path")
public class MedicalApiController {

    private MedicalService medicalService;

    @Autowired
    public MedicalApiController(@Lazy MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    @Bean
    MedicalEntry medicalEntry() { return null; }

    @Bean
    MedicalService medicalService() { return null; }


    // -- POST Patient Data
    @ApiOperation(value = "Add new medical data for a patient", nickname = "createMedicalEntry")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Null response"),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
            @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
            @ApiResponse(code = 404, message = "Resource was not found", response = Error.class),
            @ApiResponse(code = 500, message = "Unexpected Error", response = Error.class) })
    @RequestMapping(value = "/patient", produces = { APPLICATION_JSON_VALUE }, consumes = { APPLICATION_JSON_VALUE }, method = RequestMethod.POST)
    public ResponseEntity<Void> createMedicalEntry(
            @ApiParam(value = "The medical data points", required = true) @Valid @RequestBody MedicalEntry medicalEntry) {

        medicalService.createMedicalEntry(medicalEntry);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // -- GET Patient Data
    @ApiOperation(value = "Get medical data for a patient", nickname = "getPatientMedicalData", response = PatientMedicalEntry.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK Response", response = PatientMedicalEntry.class),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
            @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
            @ApiResponse(code = 404, message = "Resource Not Found", response = Error.class),
            @ApiResponse(code = 500, message = "Unexpected Error", response = Error.class) })
    @RequestMapping(value = "patient/{identifier}", produces = { APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<PatientMedicalEntry> getPatientMedicalData(
            @ApiParam(value = "The identifier of the patient to get the medical data for", required = true) @PathVariable("identifier") String identifier) {

        PatientMedicalEntry patientMedicalEntry = medicalService.getPatientMedicalData(identifier);
        return new ResponseEntity<>(patientMedicalEntry, HttpStatus.OK);
    }
}