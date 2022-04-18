package com.kruger.vaccinationinventoryback.presentation.controller;

import com.kruger.vaccinationinventoryback.presentation.Paginator;
import com.kruger.vaccinationinventoryback.presentation.presenter.EmployeePresenter;
import com.kruger.vaccinationinventoryback.service.EmployeeService;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Generated
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService workOrderService;

    @GetMapping("/getEmployeesPaginated")
        public Paginator getEmployeesPaginated(String searchValue, Integer page, Integer size) {
        searchValue = searchValue.replace(' ', '%');
        Pageable pageable = PageRequest.of(page, size);

        return workOrderService.getEmployeesPaginated(searchValue, pageable);
    }

    @GetMapping("/getWorkOrderById")
    public EmployeePresenter getEmployeeById(@RequestParam("employeeId") UUID employeeId){
        return workOrderService.getEmployeeById(employeeId) ;
    }
}
