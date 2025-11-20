package tn.esprit.spring.tpcafe_harounbensalem.services;


import tn.esprit.spring.tpcafe_harounbensalem.entities.Article;

import java.util.List;

public interface IArticleService {
    Article addArticle(Article a);
    List<Article> saveArticle(List<Article> Articles);
    Article selectArticleByIdWithGet(Long idArticle);
    Article selectArticleByIdWithOrElse(Long idArticle);
    List<Article> selectAllArticles();
    void deleteArticle(Article a);
    void deleteAllArticles();
    void deleteArticleById(long idArticle);
    long countingArticles();
    boolean verifArticleById(long idArticle);
}
