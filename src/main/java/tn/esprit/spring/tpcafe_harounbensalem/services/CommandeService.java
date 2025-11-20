package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Commande;
import tn.esprit.spring.tpcafe_harounbensalem.repositories.CommandeRepository;

import java.util.List;

public class CommandeService implements ICommandeService {
    private CommandeRepository CommandeRepository;

    @Override
    public Commande addCommande(Commande cmnd) {
        return CommandeRepository.save(cmnd);
    }

    @Override
    public List<Commande> saveCommande(List<Commande> Commandes) {
        return CommandeRepository.saveAll(Commandes);
    }

    @Override
    public Commande selectCommandeByIdWithGet(Long id) {
        return CommandeRepository.findById(id).get();
    }
    @Override
    public Commande selectCommandeByIdWithOrElse(Long id) {
        Commande a=Commande.builder().build();
        return CommandeRepository.findById(id).orElse(a);
    }


    @Override
    public List<Commande> selectAllCommandes() {
        return CommandeRepository.findAll();
    }

    @Override
    public void deleteCommande(Commande cmnd) {
        CommandeRepository.delete(cmnd);
    }

    @Override
    public void deleteAllCommandes() {
        CommandeRepository.deleteAll();

    }

    @Override
    public void deleteCommandeById(long id) {
        CommandeRepository.deleteById(id);
    }

    @Override
    public long countingCommandes() {
        return CommandeRepository.count();
    }

    @Override
    public boolean verifCommandeById(long id) {
        return CommandeRepository.existsById(id);
    }
}
