package com.zifeiwo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zifeiwo.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
