package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Article;
import com.example.demo.service.ArticleServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticleController {
	
	@Autowired
	ArticleServiceImpl articleservideImpl;
	
	@GetMapping("/article")
	public List<Article> listArticle(){
		return articleservideImpl.listArticle();
	}
	
	@PostMapping("/article")
	public Article saveArticle(@RequestBody Article article) {
		
		return articleservideImpl.saveArticle(article);
	}
	
	@GetMapping("/article/{id}")
	public Article articleXID(@PathVariable(name="id") Long id) {
		
		Article manufacturer_xid= new Article();
		
		manufacturer_xid=articleservideImpl.articleXID(id);
		
		System.out.println("Manufacturer XID: "+manufacturer_xid);
		
		return manufacturer_xid;
	}
	
	@PutMapping("/article/{id}")
	public Article updateArticle(@PathVariable(name="id")Long id,@RequestBody Article article) {
		
		Article article_select;
		Article article_update;
		
		article_select= articleservideImpl.articleXID(id);
		
		article_select.setName(article.getName());
		article_select.setPrice(article.getPrice());
		article_select.setManufacturer(article.getManufacturer());
	
		article_update = articleservideImpl.updateArticle(article_select);
		
		System.out.println("El article actualizado es: "+ article_update);
		
		return article_update;
	}
	
	@DeleteMapping("/article/{id}")
	public void deleteArticle(@PathVariable(name="id")Long id) {
		articleservideImpl.deleteArticle(id);
	}


}
