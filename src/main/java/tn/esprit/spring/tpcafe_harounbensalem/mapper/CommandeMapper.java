package tn.esprit.spring.tpcafe_harounbensalem.mapper;

import org.mapstruct.Mapper;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Commande.CommandeRequest;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Commande.CommandeResponse;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Commande;

@Mapper(componentModel = "spring")
public interface CommandeMapper {

    Commande toEntity(CommandeRequest dto);
    CommandeResponse toDto(Commande commande);
}
