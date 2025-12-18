package tn.esprit.spring.tpcafe_harounbensalem.mapper;

import org.mapstruct.Mapper;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Promotion.PromotionRequest;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Promotion.PromotionResponse;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Promotion;

@Mapper(componentModel = "spring")
public interface PromotionMapper {

    Promotion toEntity(PromotionRequest dto);
    PromotionResponse toDto(Promotion promotion);

}
