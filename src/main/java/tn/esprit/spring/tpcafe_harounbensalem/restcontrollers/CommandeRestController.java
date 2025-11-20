package tn.esprit.spring.tpcafe_harounbensalem.restcontrollers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Commande;
import tn.esprit.spring.tpcafe_harounbensalem.services.ICommandeService;

import java.util.List;

@RestController
@RequestMapping("Commande")
public class CommandeRestController {
    private ICommandeService CommandeService;

    @PostMapping
    public Commande addCommande(Commande cmnd) {
        return CommandeService.addCommande(cmnd);
    }

    @PostMapping
    public List<Commande> saveCommande(List<Commande> Commandes) {
        return CommandeService.saveCommande(Commandes);
    }

    @GetMapping
    public Commande selectCommandeByIdWithGet(Long id) {
        return CommandeService.selectCommandeByIdWithGet(id);
    }

    @GetMapping
    public Commande selectCommandeByIdWithOrElse(Long id) {
        return CommandeService.selectCommandeByIdWithOrElse(id);
    }

    @GetMapping
    public List<Commande> selectAllCommandes() {
        return CommandeService.selectAllCommandes();
    }

    @DeleteMapping
    public void deleteCommande(Commande cmnd) {
        CommandeService.deleteCommande(cmnd);
    }

    @DeleteMapping
    public void deleteAllCommandes() {
        CommandeService.deleteAllCommandes();
    }

    @DeleteMapping
    public void deleteCommandeById(long id) {
        CommandeService.deleteCommandeById(id);
    }

    @GetMapping
    public long countingCommandes() {
        return CommandeService.countingCommandes();
    }

    @GetMapping
    public boolean verifCommandeById(long id) {
        return CommandeService.verifCommandeById(id);
    }
}