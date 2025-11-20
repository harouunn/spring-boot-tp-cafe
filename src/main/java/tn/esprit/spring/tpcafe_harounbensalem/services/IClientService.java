package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client c);
    List<Client> saveClient(List<Client> Clients);
    Client selectClientByIdWithGet(Long idClient);
    Client selectClientByIdWithOrElse(Long idClient);
    List<Client> selectAllClients();
    void deleteClient(Client c);
    void deleteAllClients();
    void deleteClientById(long idClient);
    long countingClients();
    boolean verifClientById(long idClient);
}
