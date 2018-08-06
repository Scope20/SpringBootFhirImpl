package com.springapi.fhir.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;


// -- Indicates class is supposed to be validated at the method level
@Validated
@Component
public class PatientMedicalEntry {
    @JsonProperty("identifier")
    private String identifier = null;
    @JsonProperty("active")
    private Boolean active = null;
    @JsonProperty("name")
    private String name = null;
    @JsonProperty("telecom")
    private String telecom = null;
    @JsonProperty("gender")
    private String gender = null;
    @JsonProperty("birthDate")
    private LocalDate birthDate = null;
    //TODO Set entry.setDeceased(LocalDateTime.of())
    @JsonProperty("deceased")
    private Boolean deceased = null;
    @JsonProperty("address")
    private String address = null;
    @JsonProperty("maritalStatus")
    private String maritalStatus = null;
    @JsonProperty("multipleBirth")
    private String multipleBirth = null;
    @JsonProperty("photo")
    private String photo = null;
    //TODO Set all Contact attributes -> look to FHIR Documentation : http://hl7.org/fhir/patient.html
    @JsonProperty("contact")
    private String contact = null;
    //TODO Set all Animal attributes
    @JsonProperty("animal")
    private String animal = null;
    //TODO Set all Communication attributes
    @JsonProperty("communication")
    private String communication = null;
    //TODO change all instances of 'careProvider' to 'generalPractitioner'
    @JsonProperty("careProvider")
    private String careProvider = null;
    @JsonProperty("managingOrganization")
    private String managingOrganization = null;
    //TODO Set all Link attributes
    @JsonProperty("link")
    private String link = null;


    // -- identifier
    public PatientMedicalEntry identifier(String identifier) {
        this.identifier = identifier;

        return this;
    }

    /**
     * The identification no. of the patient
     *
     * @return patientId
     **/

    @ApiModelProperty( required = true , value = "The identification number of the patient")
    @NotNull
    // -- Adds and manipulates data of a model property.
    public String getIdentifier() {

        return identifier;
    }

    public void setIdentifier(String identifier) {

        this.identifier = identifier;
    }


    // -- active
    public PatientMedicalEntry active(Boolean active) {
        this.active = active;

        return this;
    }
    /**
     * Whether this patients record is in active use
     *
     * @return active
     **/

    @ApiModelProperty(value = "Whether this patients record is in active use")
    public Boolean getActive() {

        return active;
    }

    public void setActive(Boolean active) {

        this.active = active;
    }


    // -- name
    public PatientMedicalEntry name(String name) {
        this.name = name;
        return this;
    }
    /**
     * A name associated with the patient
     *
     * @return name
     */
    @ApiModelProperty(value = "A name associated with the patient")
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // -- telecom
    public PatientMedicalEntry telecom(String telecom) {
        this.telecom = telecom;

        return this;
    }
    /**
     * A contact detail for the individual
     *
     * @return telecom
     */
    @ApiModelProperty(value = "A contact detail for the individual")
    public String getTelecom() {
        return telecom;
    }

    public void setTelecom(String telecom) {
        this.telecom = telecom;
    }


    // -- gender
    public PatientMedicalEntry gender(String gender) {
        this.gender = gender;

        return this;
    }
    /**
     * male | female | other | unknown
     *
     * @return gender
     */
    @ApiModelProperty(value = "male | female | other | unknown")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    // -- birthDate
    public PatientMedicalEntry birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    /**
     * The date of birth for the individual
     *
     * @return birthDate
     */
    @ApiModelProperty(value = "The date of birth for the individual")
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    // -- deceased
    public PatientMedicalEntry deceased(Boolean deceased) {
        this.deceased = deceased;
        return this;
    }

    /**
     * Indicates if the individual is deceased or not
     *
     * @return deceased
     */
    @ApiModelProperty(value = "Indicates if the individual is deceased or not")
    public Boolean getDeceased() {
        return deceased;
    }

    public void setDeceased(Boolean deceased) {
        this.deceased = deceased;
    }


    // -- address
    public PatientMedicalEntry address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Addresses for the individual
     *
     * @return
     */
    @ApiModelProperty(value = "Addresses for the individual")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // -- maritalStatus
    public PatientMedicalEntry maritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    /**
     * Marital (civil) status of a patient
     *
     * @return
     */
    @ApiModelProperty(value = "Marital (civil) status of a patient")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    // -- multipleBirth
    public PatientMedicalEntry multipleBirth(String multipleBirth) {
        this.multipleBirth = multipleBirth;
        return this;
    }

    /**
     * Whether patient is part of a multiple birth
     *
     * @return
     */
    @ApiModelProperty(value = "Whether patient is part of a multiple birth")
    public String getMultipleBirth() {
        return multipleBirth;
    }

    public void setMultipleBirth(String multipleBirth) {
        this.multipleBirth = multipleBirth;
    }


    // -- photo
    public PatientMedicalEntry photo(String photo) {
        this.photo = photo;
        return this;
    }

    /**
     * Image of the patient
     *
     * @return
     */
    @ApiModelProperty(value = "Image of the patient")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    // -- contact
    public PatientMedicalEntry contact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * A contact party (e.g. guardian, partner, friend) for the patient
     *
     * @return
     */
    @ApiModelProperty(value = "A contact party (e.g. guardian, partner, friend) for the patient")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    // -- animal
    public PatientMedicalEntry animal(String animal) {
        this.animal = animal;
        return this;
    }

    /**
     * This patient is known to be an animal (non-human)
     *
     * @return
     */
    @ApiModelProperty(value = "This patient is known to be an animal (non-human)")
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }


    // -- communication
    public PatientMedicalEntry communication(String communication) {
        this.communication = communication;
        return this;
    }

    /**
     * A list of Languages which may be used to communicate with the patient about his or her health
     *
     * @return
     */
    @ApiModelProperty(value = "A list of Languages which may be used to communicate with the patient about his or her health")
    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }


    // -- careProvider
    public PatientMedicalEntry careProvider(String careProvider) {
        this.careProvider = careProvider;
        return this;
    }

    /**
     * Patient's nominated primary care provider
     *
     * @return
     */
    @ApiModelProperty(value = "Patient's nominated primary care provider")
    public String getcareProvider() {
        return careProvider;
    }

    public void setcareProvider(String careProvider) {
        this.careProvider = careProvider;
    }


    // -- managingOrganization
    public PatientMedicalEntry managingOrganization(String managingOrganization) {
        this.managingOrganization = managingOrganization;
        return this;
    }

    /**
     * Organization that is the custodian of the patient record
     *
     * @return
     */
    @ApiModelProperty(value = "Organization that is the custodian of the patient record")
    public String getManagingOrganization() {
        return managingOrganization;
    }

    public void setManagingOrganization(String managingOrganization) {
        this.managingOrganization = managingOrganization;
    }


    // -- link
    public PatientMedicalEntry link(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return link;
    }

    /**
     * Link to another patient resource that concerns the same actual person
     *
     * @param link
     */
    @ApiModelProperty("Link to another patient resource that concerns the same actual person")
    public void setLink(String link) {
        this.link = link;
    }

}
