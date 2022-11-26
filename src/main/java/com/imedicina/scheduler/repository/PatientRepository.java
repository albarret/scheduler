package com.imedicina.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imedicina.scheduler.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{}
