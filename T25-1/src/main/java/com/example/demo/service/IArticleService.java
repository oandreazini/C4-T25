package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Article;

public interface IArticleService {
	
	//Metodos del CRUD
			public List<Article> listArticle(); //Listar All 
			
			public Article saveArticle(Article manufacturer);	//Guarda un manufacturer CREATE
			
			public Article articleXID(Long id); //Leer datos de un manufacturer READ
			
			public Article updateArticle(Article manufacturer); //Actualiza datos del manufacturer UPDATE
			
			public void deleteArticle(Long id);// Elimina el manufacturer DELETE

}
