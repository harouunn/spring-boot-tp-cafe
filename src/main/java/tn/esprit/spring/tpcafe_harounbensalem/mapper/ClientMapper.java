package tn.esprit.spring.tpcafe_harounbensalem.mapper;

import org.mapstruct.Mapper;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Client.ClientRequest;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Client.ClientResponse;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Client;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    Client toEntity(ClientRequest dto);
    ClientResponse toDto(Client client);

}
