package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticleDAO;
import com.example.demo.dto.Article;

@Service
public class ArticleServiceImpl implements IArticleService {
	
	//Utilizamos los metodos de la interface IManufacturerDAO, es como si instaciaramos.
	@Autowired
	IArticleDAO iArticleDAO;
	
	@Override
	public List<Article> listArticle() {
		
		return iArticleDAO.findAll();
	}

	@Override
	public Article saveArticle(Article article) {
		
		return iArticleDAO.save(article);
	}

	@Override
	public Article articleXID(Long id) {
		
		return iArticleDAO.findById(id).get();
	}

	@Override
	public Article updateArticle(Article article) {
		
		return iArticleDAO.save(article);
	}

	@Override
	public void deleteArticle(Long id) {
		
		iArticleDAO.deleteById(id);
	}

}
