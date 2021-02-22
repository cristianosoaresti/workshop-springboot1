package com.cristianostudy.javacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianostudy.javacourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}