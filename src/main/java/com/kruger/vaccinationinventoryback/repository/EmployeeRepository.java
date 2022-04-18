package com.kruger.vaccinationinventoryback.repository;

import com.kruger.vaccinationinventoryback.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface EmployeeRepository extends CrudRepository<Employee, UUID> {
    @Query("SELECT e " +
            "FROM Employee e " +
            "WHERE LOWER(dni) like LOWER(CONCAT('%',:searchValue,'%')) " +
            "OR LOWER(firstName) like LOWER(CONCAT('%',:searchValue,'%')) " +
            "OR LOWER(lastName) like LOWER(CONCAT('%',:searchValue,'%')) ")
    Page<Employee> findByFilters(@Param("searchValue") String searchValue,
                                  @Param("pageable") Pageable pageable);
}
