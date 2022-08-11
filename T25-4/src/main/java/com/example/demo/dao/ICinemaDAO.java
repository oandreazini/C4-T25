package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Cinema;


public interface ICinemaDAO  extends JpaRepository<Cinema, Long> {

}
