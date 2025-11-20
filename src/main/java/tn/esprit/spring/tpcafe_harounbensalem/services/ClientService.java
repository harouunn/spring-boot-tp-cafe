package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Client;

import tn.esprit.spring.tpcafe_harounbensalem.repositories.ClientRepository;

import java.util.List;

public class ClientService implements IClientService {
    private ClientRepository ClientRepository;

    @Override
    public Client addClient(Client c) {
        return ClientRepository.save(c);
    }

    @Override
    public List<Client> saveClient(List<Client> Clients) {
        return ClientRepository.saveAll(Clients);
    }

    @Override
    public Client selectClientByIdWithGet(Long id) {
        return ClientRepository.findById(id).get();
    }
    @Override
    public Client selectClientByIdWithOrElse(Long id) {
        Client a=Client.builder().build();
        return ClientRepository.findById(id).orElse(a);
    }


    @Override
    public List<Client> selectAllClients() {
        return ClientRepository.findAll();
    }

    @Override
    public void deleteClient(Client c) {
        ClientRepository.delete(c);
    }

    @Override
    public void deleteAllClients() {
        ClientRepository.deleteAll();

    }

    @Override
    public void deleteClientById(long id) {
        ClientRepository.deleteById(id);
    }

    @Override
    public long countingClients() {
        return ClientRepository.count();
    }

    @Override
    public boolean verifClientById(long id) {
        return ClientRepository.existsById(id);
    }
}
