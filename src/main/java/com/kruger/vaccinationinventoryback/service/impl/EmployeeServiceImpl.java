package com.kruger.vaccinationinventoryback.service.impl;

import com.kruger.vaccinationinventoryback.entity.Employee;
import com.kruger.vaccinationinventoryback.entity.Vaccine;
import com.kruger.vaccinationinventoryback.presentation.Paginator;
import com.kruger.vaccinationinventoryback.presentation.presenter.EmployeePresenter;
import com.kruger.vaccinationinventoryback.presentation.presenter.VaccinePresenter;
import com.kruger.vaccinationinventoryback.repository.EmployeeRepository;
import com.kruger.vaccinationinventoryback.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Paginator getEmployeesPaginated(String searchValue, Pageable pageable) {
        Page<Employee> employees = employeeRepository.findByFilters(searchValue, pageable);
        List<EmployeePresenter> employeePresenters = new ArrayList<>();
        employees.getContent().forEach(employee -> {
            employeePresenters.add(toEmployeePresenter(employee));
        });
        Set<EmployeePresenter> treeSet = new TreeSet<>(new Comparator<EmployeePresenter>() {
            @Override
            public int compare(EmployeePresenter employeePresenter, EmployeePresenter t1) {
                return employeePresenter.getEmployeeId().compareTo(t1.getEmployeeId()) * -1;
            }
        });
        treeSet.addAll(employeePresenters);
        Paginator paginator = new Paginator(employees.getTotalPages(), employees.getTotalElements(), treeSet);

        return paginator;
    }

    @Override
    public EmployeePresenter toEmployeePresenter(Employee employee) {
        List<VaccinePresenter> vaccinePresenters = new ArrayList<>();
        employee.getVaccines().forEach(vaccine -> {
            vaccinePresenters.add(toVaccinePresenter(vaccine));
        });
        return EmployeePresenter.builder()
                .employeeId(employee.getEmployeeId())
                .dni(employee.getDni())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .mail(employee.getMail())
                .dateOfBirth(employee.getDateOfBirth())
                .address(employee.getAddress())
                .phone(employee.getPhone())
                .status(employee.getStatus())
                .vaccinePresenters(vaccinePresenters)
                .build();
    }

    @Override
    public VaccinePresenter toVaccinePresenter(Vaccine vaccine) {
        return VaccinePresenter.builder()
                .vaccineId(vaccine.getVaccineId())
                .name(vaccine.getName())
                .description(vaccine.getDescription())
                .build();
    }

    @Override
    public EmployeePresenter getEmployeeById(UUID employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()) {
            return toEmployeePresenter(employee.get());
        }
        return null;
    }
}
