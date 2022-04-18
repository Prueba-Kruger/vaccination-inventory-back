package com.kruger.vaccinationinventoryback.service;

import com.kruger.vaccinationinventoryback.entity.Employee;
import com.kruger.vaccinationinventoryback.entity.Vaccine;
import com.kruger.vaccinationinventoryback.presentation.Paginator;
import com.kruger.vaccinationinventoryback.presentation.presenter.EmployeePresenter;
import com.kruger.vaccinationinventoryback.presentation.presenter.VaccinePresenter;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface EmployeeService {

    Paginator getEmployeesPaginated(String searchValue, Pageable pageable);

    EmployeePresenter getEmployeeById(UUID employeeId);

    EmployeePresenter toEmployeePresenter(Employee workOrder);

    VaccinePresenter toVaccinePresenter(Vaccine vaccine);
}
