package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Commande;

import java.util.List;

public interface ICommandeService {
    Commande addCommande(Commande cmnd);
    List<Commande> saveCommande(List<Commande> Commandes);
    Commande selectCommandeByIdWithGet(Long idCommande);
    Commande selectCommandeByIdWithOrElse(Long idCommande);
    List<Commande> selectAllCommandes();
    void deleteCommande(Commande cmnd);
    void deleteAllCommandes();
    void deleteCommandeById(long idCommande);
    long countingCommandes();
    boolean verifCommandeById(long idCommande);
}
