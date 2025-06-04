package com.example.aiback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aiback.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
