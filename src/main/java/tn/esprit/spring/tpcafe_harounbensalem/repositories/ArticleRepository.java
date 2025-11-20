package tn.esprit.spring.tpcafe_harounbensalem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
