package tn.esprit.spring.tpcafe_harounbensalem.dto.Client;

import lombok.*;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Adresse.AdresseResponse;
import tn.esprit.spring.tpcafe_harounbensalem.dto.CarteFidelite.CarteFideliteResponse;
import tn.esprit.spring.tpcafe_harounbensalem.dto.Commande.CommandeResponse;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientResponse {
     private long idClient;
     private String nom;
     private String prenom;
     private LocalDate dateNaissance;

     private CarteFideliteResponse carte;
     private AdresseResponse adresse;
     private List<CommandeResponse> commandes;
}
