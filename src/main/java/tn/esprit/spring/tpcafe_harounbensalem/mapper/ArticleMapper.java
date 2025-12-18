package tn.esprit.spring.tpcafe_harounbensalem.mapper;

import org.mapstruct.Mapper;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Article.ArticleRequest;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Article.ArticleResponse;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Article;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    Article toEntity(ArticleRequest dto);
    ArticleResponse toDto(Article article);

}
