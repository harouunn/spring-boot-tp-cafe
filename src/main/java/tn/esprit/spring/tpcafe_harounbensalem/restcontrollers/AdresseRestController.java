package tn.esprit.spring.tpcafe_harounbensalem.restcontrollers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Adresse;
import tn.esprit.spring.tpcafe_harounbensalem.services.IAdresseService;

import java.util.List;

@RestController
@RequestMapping("adresse")
public class AdresseRestController {
    private IAdresseService adresseService;
    @PostMapping
    public Adresse addAdresse(Adresse a) {
        return adresseService.addAdresse(a);
    }
    @PostMapping
    public List<Adresse> saveAdresse(List<Adresse> adresses) {
        return adresseService.saveAdresse(adresses);
    }
    @GetMapping
    public Adresse selectAdresseByIdWithGet(Long id) {
        return adresseService.selectAdresseByIdWithGet(id);
    }
    @GetMapping
    public Adresse selectAdresseByIdWithOrElse(Long id) {
        return adresseService.selectAdresseByIdWithOrElse(id);
    }
    @GetMapping
    public List<Adresse> selectAllAdresses() {
        return adresseService.selectAllAdresses();
    }
    @DeleteMapping
    public void deleteAdresse(Adresse a) {
        adresseService.deleteAdresse(a);
    }
    @DeleteMapping
    public void deleteAllAdresses() {
        adresseService.deleteAllAdresses();
    }
    @DeleteMapping
    public void deleteAdresseById(long id) {
        adresseService.deleteAdresseById(id);
    }
    @GetMapping
    public long countingAdresses() {
        return adresseService.countingAdresses();
    }
    @GetMapping
    public boolean verifAdresseById(long id) {
        return adresseService.verifAdresseById(id);
    }

}
