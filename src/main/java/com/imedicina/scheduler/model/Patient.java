package com.imedicina.scheduler.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "patient")
public class Patient extends User {

    @Id
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column(name = "total_appointments")
    private Integer totalAppointments = 0;

    @Transient
    private Boolean onlineStatus = false;

    public Patient() {
        super();
    }

    public Patient(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    public Patient(Long id, String username, String password, Integer totalAppointments) {
        super(username, password);
        this.id = id;
        this.username = username;
        this.password = password;
        this.totalAppointments = totalAppointments;
    }
    
}
