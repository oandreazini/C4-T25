package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Employees;

public interface IEmployeesDAO  extends JpaRepository<Employees,Long> {

}
