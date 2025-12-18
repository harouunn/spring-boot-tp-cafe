package tn.esprit.spring.tpcafe_harounbensalem.mapper;

import org.mapstruct.Mapper;
import tn.esprit.spring.tpcafe_harounbensalem.dto.CarteFidelite.CarteFideliteRequest;
import tn.esprit.spring.tpcafe_harounbensalem.dto.CarteFidelite.CarteFideliteResponse;
import tn.esprit.spring.tpcafe_harounbensalem.entities.CarteFidelite;

@Mapper(componentModel = "spring")
public interface CarteFideliteMapper {

    CarteFidelite toEntity(CarteFideliteRequest dto);
    CarteFideliteResponse toDto(CarteFidelite carteFidelite);

}
