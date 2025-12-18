package tn.esprit.spring.tpcafe_harounbensalem.services.Article;

import tn.esprit.spring.tpcafe_harounbensalem.dto.Article.ArticleRequest;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Article.ArticleResponse;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Promotion;
import tn.esprit.spring.tpcafe_harounbensalem.entities.TypeArticle;

import java.util.List;

public interface IArticleService {

    ArticleResponse addArticle(ArticleRequest articleRequest);

    ArticleResponse selectArticleById(long id);
    List<ArticleResponse> getAllArticles();
    void ajouterPromoEtAffecterAArticle(Promotion p, long idA);

    ArticleResponse updateArticle(long id, ArticleRequest request);

    void deleteArticleById(long id);
    void deleteAllArticles();

    long countArticles();
    boolean verifArticleById(long id);

    List<ArticleResponse> findByNom(String nom);
    List<ArticleResponse> findByType(TypeArticle type);
    List<ArticleResponse> findByPrix(float prix);
    boolean existsByNom(String nom);
    long countByType(TypeArticle type);
    List<ArticleResponse> findByNomContainingAndType(String nom, TypeArticle type);
    List<ArticleResponse> findByPrixBetweenAndType(float min, float max, TypeArticle type);
    List<ArticleResponse> findByNomStartsWithSortedByPrix(String prefix);
    List<ArticleResponse> findMaxPriceByType(TypeArticle type);
    List<ArticleResponse> findByNomOrTypeOrderByPrixDesc(String str, TypeArticle type);
    List<ArticleResponse> findByNomStartsWith(String prefix);
    List<ArticleResponse> findByNomEndsWith(String suffix);
    List<ArticleResponse> findByTypeIsNull();
    List<ArticleResponse> findByPrixNotNull();
  /**  List<ArticleResponse> findWithActivePromotions();**/
    List<ArticleResponse> findByNomContainingAndPrixBetween(String nom, float min, float max);

}


