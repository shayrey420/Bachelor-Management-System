package com.bechalor.sealthedeal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String specialized;
    private String registrationNumber;
    private String name;
    private String appointmentContact;
    private String degree;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getAppointmentContact() {
        return appointmentContact;
    }

    public void setAppointmentContact(String appointmentContact) {
        this.appointmentContact = appointmentContact;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<DoctorHasConsumer> DoctorHasConsumer=new LinkedList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<com.bechalor.sealthedeal.model.DoctorHasConsumer> getDoctorHasConsumer() {
        return DoctorHasConsumer;
    }

    public void setDoctorHasConsumer(List<com.bechalor.sealthedeal.model.DoctorHasConsumer> doctorHasConsumer) {
        DoctorHasConsumer = doctorHasConsumer;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
