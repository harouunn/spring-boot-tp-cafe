package tn.esprit.spring.tpcafe_harounbensalem.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.esprit.spring.tpcafe_harounbensalem.dto.DetailCommande.DetailCommandeRequest;
import tn.esprit.spring.tpcafe_harounbensalem.dto.DetailCommande.DetailCommandeResponse;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Detail_Commande;

@Mapper(componentModel = "spring")
public interface DetailCommandeMapper {

    Detail_Commande toEntity(DetailCommandeRequest dto);

    @Mapping(source = "article.idArticle", target = "articleId")
    @Mapping(source = "commande.idCommande", target = "commandeId")

    DetailCommandeResponse toDto(Detail_Commande detailCommande);

}
