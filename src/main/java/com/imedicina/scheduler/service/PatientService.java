package com.imedicina.scheduler.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.imedicina.scheduler.model.Patient;
import com.imedicina.scheduler.repository.PatientRepository;

@Service
public class PatientService {
    
    private final PatientRepository PatientRepository;

    public PatientService(PatientRepository PatientRepository){
        this.PatientRepository = PatientRepository;
    }

    public List<Patient> fetchAllPatients() {
        return PatientRepository.findAll();
    }

    public Patient save(Patient Patient) {
        return PatientRepository.save(Patient);
    }

    public void remove(Patient Patient) {
        PatientRepository.delete(Patient);
    }
}
