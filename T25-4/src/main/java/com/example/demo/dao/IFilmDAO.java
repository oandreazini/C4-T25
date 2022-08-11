package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Film;

public interface IFilmDAO extends JpaRepository<Film, Long>{

}
