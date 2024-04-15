package com.example.ads_api.dto;

import com.example.ads_api.model.Address;
import jakarta.persistence.OneToOne;

public class PatientDTO {
    private Integer id;
    private String patientNo;
    private String name;
    private String phone;
    private String email;
    private Address address;
}
