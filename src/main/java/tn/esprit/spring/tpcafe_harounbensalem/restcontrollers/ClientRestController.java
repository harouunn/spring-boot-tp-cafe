package tn.esprit.spring.tpcafe_harounbensalem.restcontrollers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Client;
import tn.esprit.spring.tpcafe_harounbensalem.services.IClientService;

import java.util.List;

@RestController
@RequestMapping("Client")
public class ClientRestController {
    private IClientService ClientService;

    @PostMapping
    public Client addClient(Client c) {
        return ClientService.addClient(c);
    }

    @PostMapping
    public List<Client> saveClient(List<Client> Clients) {
        return ClientService.saveClient(Clients);
    }

    @GetMapping
    public Client selectClientByIdWithGet(Long id) {
        return ClientService.selectClientByIdWithGet(id);
    }

    @GetMapping
    public Client selectClientByIdWithOrElse(Long id) {
        return ClientService.selectClientByIdWithOrElse(id);
    }

    @GetMapping
    public List<Client> selectAllClients() {
        return ClientService.selectAllClients();
    }

    @DeleteMapping
    public void deleteClient(Client c) {
        ClientService.deleteClient(c);
    }

    @DeleteMapping
    public void deleteAllClients() {
        ClientService.deleteAllClients();
    }

    @DeleteMapping
    public void deleteClientById(long id) {
        ClientService.deleteClientById(id);
    }

    @GetMapping
    public long countingClients() {
        return ClientService.countingClients();
    }

    @GetMapping
    public boolean verifClientById(long id) {
        return ClientService.verifClientById(id);
    }
}