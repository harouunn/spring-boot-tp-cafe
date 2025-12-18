package tn.esprit.spring.tpcafe_harounbensalem.dto.Article;

import lombok.*;
import tn.esprit.spring.tpcafe_harounbensalem.dto.DetailCommande.DetailCommandeResponse;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Promotion.PromotionResponse;
import tn.esprit.spring.tpcafe_harounbensalem.entities.TypeArticle;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleResponse {

     private long idArticle;
     private String nomArticle;
     private float prixArticle;
     private TypeArticle typeArticle;

     private List<PromotionResponse> promotions;
     private List<DetailCommandeResponse> detailCommandes;
}
