package com.imedicina.scheduler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imedicina.scheduler.model.Appointment;
import com.imedicina.scheduler.service.AppointmentService;

@RestController
@RequestMapping(path = "/api/appointments")
public class AppointmentController {
    
    @Autowired
    private AppointmentService AppointmentService;

    @GetMapping("/")
    public ResponseEntity<List<Appointment>> fetchAllAppointments() {
        List<Appointment> response = AppointmentService.fetchAllAppointments();
        return ResponseEntity.ok(response);
    }
}
