package com.kruger.vaccinationinventoryback.service.impl;

import com.kruger.vaccinationinventoryback.entity.EmployeeVaccine;
import com.kruger.vaccinationinventoryback.repository.EmployeeVaccineRepository;
import com.kruger.vaccinationinventoryback.service.EmployeeVaccineService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class EmployeeVaccineImpl implements EmployeeVaccineService {
    @Autowired
    private EmployeeVaccineRepository employeeVaccineRepository;

    @Override
    public EmployeeVaccine saveEmployeeVaccine(EmployeeVaccine employeeVaccine) {
        return employeeVaccineRepository.save(employeeVaccine);
    }
}
