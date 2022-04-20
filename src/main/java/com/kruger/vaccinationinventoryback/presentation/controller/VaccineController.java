package com.kruger.vaccinationinventoryback.presentation.controller;

import com.kruger.vaccinationinventoryback.presentation.Paginator;
import com.kruger.vaccinationinventoryback.presentation.presenter.VaccinePresenter;
import com.kruger.vaccinationinventoryback.service.EmployeeService;
import com.kruger.vaccinationinventoryback.service.VaccineService;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Generated
@RestController
public class VaccineController {
    @Autowired
    VaccineService vaccineService;

    @GetMapping("/getVaccines")
    public List<VaccinePresenter> getVaccines() {
        return vaccineService.getVaccines();
    }
}
