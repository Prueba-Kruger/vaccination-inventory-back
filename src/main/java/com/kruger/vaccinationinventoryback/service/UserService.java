package com.kruger.vaccinationinventoryback.service;


import com.kruger.vaccinationinventoryback.entity.User;
import com.kruger.vaccinationinventoryback.presentation.presenter.UserPresenter;

public interface UserService {

    UserPresenter loginUser(String userName, String password);

}
