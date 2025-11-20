package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Adresse;

import java.util.List;

public interface IAdresseService {

    Adresse addAdresse(Adresse a);
    List<Adresse> saveAdresse(List<Adresse> Adresses);
    Adresse selectAdresseByIdWithGet(Long idAdresse);
    Adresse selectAdresseByIdWithOrElse(Long idAdresse);
    List<Adresse> selectAllAdresses();
    void deleteAdresse(Adresse a);
    void deleteAllAdresses();
    void deleteAdresseById(long idAdresse);
    long countingAdresses();
    boolean verifAdresseById(long idAdresse);
}
