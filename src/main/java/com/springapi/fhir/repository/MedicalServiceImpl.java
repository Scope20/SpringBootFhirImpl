package com.springapi.fhir.repository;

import com.springapi.fhir.models.MedicalEntry;
import com.springapi.fhir.models.PatientMedicalEntry;
import com.springapi.fhir.services.MedicalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class MedicalServiceImpl implements MedicalService {
    private static final Logger LOG = LoggerFactory.getLogger(MedicalServiceImpl.class);

    @Override
    public void createMedicalEntry(MedicalEntry medicalEntry) {

        LOG.debug("Creating medicalEntry: {}", medicalEntry);
    }

    @Override
    public PatientMedicalEntry getPatientMedicalData(String identifier) {

        LOG.debug("Get patientMedicalEntry data for {}", identifier);
        return getDummyPatientMedicalEntry(identifier);
    }

    private PatientMedicalEntry getDummyPatientMedicalEntry(String identifier) {

        MedicalEntry entry = new MedicalEntry();
        entry.setIdentifier(identifier);
        entry.setActive(true);
        entry.setName("Benjamin Bricknell");
        entry.setTelecom("020 345 567");
        entry.setGender("male");
        entry.setBirthDate(LocalDate.now());
        entry.setDeceased(false);
        //TODO Set entry.setDeceased(LocalDateTime.of())
        entry.setAddress("112 Oxford Street");
        entry.setMaritalStatus("Married");
        entry.setMultipleBirth("No");
        entry.setPhoto("15245376badhja");
        entry.setContact("Jasmine Bricknell");
            //TODO Set all Contact attributes -> look to FHIR Documentation : http://hl7.org/fhir/patient.html
        entry.setAnimal("No");
            //TODO Set all Animal attributes
        entry.setCommunication("English");
            //TODO Set all Communication attributes
        entry.setcareProvider("Dr Elizabeth Booker");
            //TODO change all instances of 'careProvider' to 'generalPractitioner'
        entry.setManagingOrganization("NHS");
        entry.setLink("www.example.com");
            //TODO Set all Link attributes
        return entry;
    }

}
