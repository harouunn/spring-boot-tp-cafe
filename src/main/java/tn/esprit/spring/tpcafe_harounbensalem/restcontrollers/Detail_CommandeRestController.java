package tn.esprit.spring.tpcafe_harounbensalem.restcontrollers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Detail_Commande;
import tn.esprit.spring.tpcafe_harounbensalem.services.IDetail_CommandeService;

import java.util.List;

@RestController
@RequestMapping("Detail_Commande")
public class Detail_CommandeRestController {
    private IDetail_CommandeService Detail_CommandeService;

    @PostMapping
    public Detail_Commande addDetail_Commande(Detail_Commande dc) {
        return Detail_CommandeService.addDetail_Commande(dc);
    }

    @PostMapping
    public List<Detail_Commande> saveDetail_Commande(List<Detail_Commande> Detail_Commandes) {
        return Detail_CommandeService.saveDetail_Commande(Detail_Commandes);
    }

    @GetMapping
    public Detail_Commande selectDetail_CommandeByIdWithGet(Long id) {
        return Detail_CommandeService.selectDetail_CommandeByIdWithGet(id);
    }

    @GetMapping
    public Detail_Commande selectDetail_CommandeByIdWithOrElse(Long id) {
        return Detail_CommandeService.selectDetail_CommandeByIdWithOrElse(id);
    }

    @GetMapping
    public List<Detail_Commande> selectAllDetail_Commandes() {
        return Detail_CommandeService.selectAllDetail_Commandes();
    }

    @DeleteMapping
    public void deleteDetail_Commande(Detail_Commande dc) {
        Detail_CommandeService.deleteDetail_commande(dc);
    }

    @DeleteMapping
    public void deleteAllDetail_Commandes() {
        Detail_CommandeService.deleteAllDetail_Commandes();
    }

    @DeleteMapping
    public void deleteDetail_CommandeById(long id) {
        Detail_CommandeService.deleteDetail_CommandeById(id);
    }

    @GetMapping
    public long countingDetail_Commandes() {
        return Detail_CommandeService.countingDetail_Commandes();
    }

    @GetMapping
    public boolean verifDetail_CommandeById(long id) {
        return Detail_CommandeService.verifDetail_CommandeById(id);
    }
}