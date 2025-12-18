package tn.esprit.spring.tpcafe_harounbensalem.restcontrollers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Commande.CommandeRequest;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Commande.CommandeResponse;
import tn.esprit.spring.tpcafe_harounbensalem.services.Commande.ICommandeService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("commande")
@Tag(name = "Commande", description = "Gestion des Commandes")
@AllArgsConstructor
public class CommandeRestController {

    private ICommandeService commandeService;

    @PostMapping
    public CommandeResponse addCommande(@RequestBody CommandeRequest commandeRequest) {
        return commandeService.addCommande(commandeRequest);
    }

    @GetMapping("/{id}")
    public CommandeResponse getCommande(@PathVariable long id) {
        return commandeService.selectCommandeById(id);
    }

    @GetMapping
    public List<CommandeResponse> getAllCommandes() {
        return commandeService.selectAllCommande();
    }

    @GetMapping("/exists/{id}")
    public boolean exists(@PathVariable long id) {
        return commandeService.verifCommandeById(id);
    }

    @GetMapping("/count")
    public long count() {
        return commandeService.countCommande();
    }

    @PutMapping("/{id}")
    public CommandeResponse updateCommande(@PathVariable long id, @RequestBody CommandeRequest commandeRequest) {
        return commandeService.updateCommande(id, commandeRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteCommande(@PathVariable long id) {
        commandeService.deleteCommandeById(id);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        commandeService.deleteAllCommande();
    }

    // 1. Trouver par statut
    @GetMapping("/status/{status}")
    public List<CommandeResponse> getByStatus(@PathVariable String status) {
        return commandeService.findByStatus(status);
    }

    // 2. Trouver par date exacte
    @GetMapping("/date/{date}")
    public List<CommandeResponse> getByDate(@PathVariable LocalDate date) {
        return commandeService.findByDate(date);
    }

    // 3. Compter par statut
    @GetMapping("/count/status/{status}")
    public long countByStatus(@PathVariable String status) {
        return commandeService.countByStatus(status);
    }

    // 4. Delete avant date
    @DeleteMapping("/before/{date}")
    public void deleteBefore(@PathVariable LocalDate date) {
        commandeService.deleteBefore(date);
    }

    // 5. Entre deux dates avec statut
    @GetMapping("/between")
    public List<CommandeResponse> betweenDatesAndStatus(
            @RequestParam LocalDate d1,
            @RequestParam LocalDate d2,
            @RequestParam String status) {
        return commandeService.findBetweenDatesAndStatus(d1, d2, status);
    }

    // 6. Total > montant && statut différent
    @GetMapping("/totalGreater")
    public List<CommandeResponse> totalGreaterAndStatusNot(
            @RequestParam float montant,
            @RequestParam String status) {
        return commandeService.findTotalGreaterAndStatusNot(montant, status);
    }

    // 7. Liste statuts triées
    @GetMapping("/statuses")
    public List<CommandeResponse> getByStatuses(@RequestParam List<String> statuses) {
        return commandeService.findByStatuses(statuses);
    }

    // 8. Avant date + total dans plage
    @GetMapping("/before")
    public List<CommandeResponse> beforeAndTotalBetween(
            @RequestParam LocalDate date,
            @RequestParam float min,
            @RequestParam float max) {
        return commandeService.findBeforeDateTotalBetween(date, min, max);
    }

    // 9. Statut se termine par
    @GetMapping("/status/ends/{suffix}")
    public List<CommandeResponse> endsWithStatus(@PathVariable String suffix) {
        return commandeService.findStatusEndsWith(suffix);
    }

    // 10. Statut NULL
    @GetMapping("/status/null")
    public List<CommandeResponse> statusNull() {
        return commandeService.findStatusNull();
    }

    // 11. Total NOT NULL
    @GetMapping("/total/notnull")
    public List<CommandeResponse> totalNotNull() {
        return commandeService.findTotalNotNull();
    }

    // 12. Commandes + détails + client
    @GetMapping("/withDetails")
    public List<CommandeResponse> withDetailsAndClient() {
        return commandeService.findWithDetailsAndClient();
    }

    // 13. TOP 3 commandes récentes
    @GetMapping("/top3")
    public List<CommandeResponse> top3Recent() {
        return commandeService.top3Recent();
    }
}
