package tn.esprit.spring.tpcafe_harounbensalem.mapper;

import org.mapstruct.Mapper;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Adresse.AdresseRequest;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Adresse.AdresseResponse;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Adresse;

@Mapper(componentModel = "spring")
public interface AdresseMapper {

    Adresse toEntity(AdresseRequest dto);
    AdresseResponse toDto(Adresse adresse);

}
