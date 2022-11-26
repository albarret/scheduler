package com.imedicina.scheduler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imedicina.scheduler.model.Appointment;
import com.imedicina.scheduler.repository.AppointmentRepository;

@Service
public class AppointmentService {
    
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> fetchAllAppointments(){
        return appointmentRepository.findAll();
    }

    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public void remove(Appointment appointment) {
        appointmentRepository.delete(appointment);
    }
}
