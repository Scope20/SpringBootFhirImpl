package com.springapi.fhir.services;

import com.springapi.fhir.models.MedicalEntry;
import com.springapi.fhir.models.PatientMedicalEntry;

import javax.validation.Valid;


// implements MedicalEntry


public interface MedicalService {
    void createMedicalEntry(@Valid MedicalEntry medicalEntry);

    PatientMedicalEntry getPatientMedicalData(String identifier);

}








