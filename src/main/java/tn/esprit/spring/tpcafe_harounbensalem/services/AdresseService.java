package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Adresse;
import tn.esprit.spring.tpcafe_harounbensalem.repositories.AdresseRepository;

import java.util.List;

public class AdresseService implements IAdresseService {
    private AdresseRepository adresseRepository;
    @Override
    public Adresse addAdresse(Adresse a) {
        return adresseRepository.save(a);
    }

    @Override
    public List<Adresse> saveAdresse(List<Adresse> Adresses) {
        return adresseRepository.saveAll(Adresses);
    }

    @Override
    public Adresse selectAdresseByIdWithGet(Long id) {
        return adresseRepository.findById(id).get();
    }
    @Override
    public Adresse selectAdresseByIdWithOrElse(Long id) {
        Adresse a=Adresse.builder().rue("rerererer").build();
        return adresseRepository.findById(id).orElse(a);
    }


    @Override
    public List<Adresse> selectAllAdresses() {
        return adresseRepository.findAll();
    }

    @Override
    public void deleteAdresse(Adresse a) {
        adresseRepository.delete(a);
    }

    @Override
    public void deleteAllAdresses() {
        adresseRepository.deleteAll();

    }

    @Override
    public void deleteAdresseById(long id) {
        adresseRepository.deleteById(id);
    }

    @Override
    public long countingAdresses() {
        return adresseRepository.count();
    }

    @Override
    public boolean verifAdresseById(long id) {
        return adresseRepository.existsById(id);
    }
}


