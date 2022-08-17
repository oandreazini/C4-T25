package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Departments;

public interface IDepartmentsDAO extends JpaRepository<Departments,Long>  {

}
