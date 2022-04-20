package com.kruger.vaccinationinventoryback.repository;

import com.kruger.vaccinationinventoryback.entity.EmployeeVaccine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeVaccineRepository extends CrudRepository<EmployeeVaccine, UUID> {

}
