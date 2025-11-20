package tn.esprit.spring.tpcafe_harounbensalem.restcontrollers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Article;
import tn.esprit.spring.tpcafe_harounbensalem.services.IArticleService;

import java.util.List;

@RestController
@RequestMapping("Article")
public class ArticleRestController {
    private IArticleService ArticleService;

    @PostMapping
    public Article addArticle(Article a) {
        return ArticleService.addArticle(a);
    }

    @PostMapping
    public List<Article> saveArticle(List<Article> Articles) {
        return ArticleService.saveArticle(Articles);
    }

    @GetMapping
    public Article selectArticleByIdWithGet(Long id) {
        return ArticleService.selectArticleByIdWithGet(id);
    }

    @GetMapping
    public Article selectArticleByIdWithOrElse(Long id) {
        return ArticleService.selectArticleByIdWithOrElse(id);
    }

    @GetMapping
    public List<Article> selectAllArticles() {
        return ArticleService.selectAllArticles();
    }

    @DeleteMapping
    public void deleteArticle(Article a) {
        ArticleService.deleteArticle(a);
    }

    @DeleteMapping
    public void deleteAllArticles() {
        ArticleService.deleteAllArticles();
    }

    @DeleteMapping
    public void deleteArticleById(long id) {
        ArticleService.deleteArticleById(id);
    }

    @GetMapping
    public long countingArticles() {
        return ArticleService.countingArticles();
    }

    @GetMapping
    public boolean verifArticleById(long id) {
        return ArticleService.verifArticleById(id);
    }
}