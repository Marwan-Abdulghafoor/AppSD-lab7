package com.example.ads_api.mapper;

import com.example.ads_api.dto.PatientDTO;
import com.example.ads_api.model.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapper {
    PatientMapper PATIENT_MAPPER = Mappers.getMapper(PatientMapper.class);

    public Patient fromDtoToPatient(PatientDTO patientDTO);

    public PatientDTO fromPatientToDto(Patient patient);
}
