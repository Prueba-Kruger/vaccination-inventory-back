package com.kruger.vaccinationinventoryback.service;

import com.kruger.vaccinationinventoryback.entity.Vaccine;
import com.kruger.vaccinationinventoryback.presentation.presenter.VaccinePresenter;

import java.util.List;

public interface VaccineService {

    VaccinePresenter toVaccinePresenter(Vaccine vaccine);

    Vaccine toVaccine(VaccinePresenter vaccinePresenter);


    List<VaccinePresenter> getVaccines();

}
