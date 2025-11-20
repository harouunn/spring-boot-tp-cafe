package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Detail_Commande;

import java.util.List;

public interface IDetail_CommandeService {
    Detail_Commande addDetail_Commande(Detail_Commande dc);
    List<Detail_Commande> saveDetail_Commande(List<Detail_Commande> Detail_Commandes);
    Detail_Commande selectDetail_CommandeByIdWithGet(Long idDetail_Commande);
    Detail_Commande selectDetail_CommandeByIdWithOrElse(Long idDetail_Commande);
    List<Detail_Commande> selectAllDetail_Commandes();
    void deleteDetail_commande(Detail_Commande dc);
    void deleteAllDetail_Commandes();
    void deleteDetail_CommandeById(long idDetail_Commande);
    long countingDetail_Commandes();
    boolean verifDetail_CommandeById(long idDetail_Commande);
}
