package com.imedicina.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imedicina.scheduler.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long>{}
