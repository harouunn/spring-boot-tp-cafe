package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Detail_Commande;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Detail_Commande;
import tn.esprit.spring.tpcafe_harounbensalem.repositories.Detail_CommandeRepository;

import java.util.List;

public class Detail_CommandeService implements IDetail_CommandeService {

    private Detail_CommandeRepository Detail_CommandeRepository;
    @Override
    public Detail_Commande addDetail_Commande(Detail_Commande dc) {
        return Detail_CommandeRepository.save(dc);
    }

    @Override
    public List<Detail_Commande> saveDetail_Commande(List<Detail_Commande> Detail_Commandes) {
        return Detail_CommandeRepository.saveAll(Detail_Commandes);
    }

    @Override
    public Detail_Commande selectDetail_CommandeByIdWithGet(Long id) {
        return Detail_CommandeRepository.findById(id).get();
    }
    @Override
    public Detail_Commande selectDetail_CommandeByIdWithOrElse(Long id) {
        Detail_Commande a=Detail_Commande.builder().build();
        return Detail_CommandeRepository.findById(id).orElse(a);
    }


    @Override
    public List<Detail_Commande> selectAllDetail_Commandes() {
        return Detail_CommandeRepository.findAll();
    }

    @Override
    public void deleteDetail_commande(Detail_Commande dc) {
        Detail_CommandeRepository.delete(dc);
    }

    @Override
    public void deleteAllDetail_Commandes() {
        Detail_CommandeRepository.deleteAll();

    }

    @Override
    public void deleteDetail_CommandeById(long id) {
        Detail_CommandeRepository.deleteById(id);
    }

    @Override
    public long countingDetail_Commandes() {
        return Detail_CommandeRepository.count();
    }

    @Override
    public boolean verifDetail_CommandeById(long id) {
        return Detail_CommandeRepository.existsById(id);
    }
}