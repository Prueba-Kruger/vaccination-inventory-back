package com.kruger.vaccinationinventoryback.repository;

import com.kruger.vaccinationinventoryback.entity.User;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {

    Optional<User> findByUsernameAndPassword(String username, String password);


}
