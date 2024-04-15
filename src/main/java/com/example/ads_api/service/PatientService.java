package com.example.ads_api.service;

import com.example.ads_api.model.Patient;
import com.example.ads_api.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository repository;

    public List<Patient> getAllPatients() {
        List<Patient> patients = repository.findAll();
        return patients;
    }
}
