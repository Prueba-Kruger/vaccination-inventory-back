package com.kruger.vaccinationinventoryback.presentation.presenter;

import com.kruger.vaccinationinventoryback.entity.Employee;
import com.kruger.vaccinationinventoryback.entity.Vaccine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeVaccinePresenter {

    private UUID employeeVaccineId;
    private String date;
    private String dose;
    private VaccinePresenter vaccinePresenter;
}
