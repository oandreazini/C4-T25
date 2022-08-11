package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Box;

public interface IBoxDAO  extends JpaRepository<Box, Long> {

}
