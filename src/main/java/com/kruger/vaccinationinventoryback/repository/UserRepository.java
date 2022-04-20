package com.kruger.vaccinationinventoryback.repository;

import com.kruger.vaccinationinventoryback.entity.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

    Optional<User> findByUsernameAndPassword(String username, String password);


}
