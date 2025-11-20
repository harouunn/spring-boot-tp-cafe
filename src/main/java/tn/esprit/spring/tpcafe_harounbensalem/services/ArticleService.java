package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Article;

import tn.esprit.spring.tpcafe_harounbensalem.repositories.ArticleRepository;

import java.util.List;

public class ArticleService implements IArticleService {
    private ArticleRepository ArticleRepository;
    @Override
    public Article addArticle(Article a) {
        return ArticleRepository.save(a);
    }

    @Override
    public List<Article> saveArticle(List<Article> Articles) {
        return ArticleRepository.saveAll(Articles);
    }

    @Override
    public Article selectArticleByIdWithGet(Long id) {
        return ArticleRepository.findById(id).get();
    }
    @Override
    public Article selectArticleByIdWithOrElse(Long id) {
        Article a=Article.builder().build();
        return ArticleRepository.findById(id).orElse(a);
    }


    @Override
    public List<Article> selectAllArticles() {
        return ArticleRepository.findAll();
    }

    @Override
    public void deleteArticle(Article a) {
        ArticleRepository.delete(a);
    }

    @Override
    public void deleteAllArticles() {
        ArticleRepository.deleteAll();

    }

    @Override
    public void deleteArticleById(long id) {
        ArticleRepository.deleteById(id);
    }

    @Override
    public long countingArticles() {
        return ArticleRepository.count();
    }

    @Override
    public boolean verifArticleById(long id) {
        return ArticleRepository.existsById(id);
    }
}
