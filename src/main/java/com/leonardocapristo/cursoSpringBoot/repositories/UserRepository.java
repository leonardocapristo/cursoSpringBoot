package com.leonardocapristo.cursoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardocapristo.cursoSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
