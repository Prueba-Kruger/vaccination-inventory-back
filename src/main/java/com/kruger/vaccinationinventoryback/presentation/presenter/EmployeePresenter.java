package com.kruger.vaccinationinventoryback.presentation.presenter;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePresenter {
    private UUID employeeId;
    private String dni;
    private String firstName;
    private String lastName;
    private String mail;
    private Date dateOfBirth;
    private String address;
    private String phone;
    private String status;
    @Builder.Default
    private List<EmployeeVaccinePresenter> employeeVaccinePresenters = new ArrayList<>();
}
