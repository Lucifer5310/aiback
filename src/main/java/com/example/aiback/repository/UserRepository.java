package com.example.aiback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aiback.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
