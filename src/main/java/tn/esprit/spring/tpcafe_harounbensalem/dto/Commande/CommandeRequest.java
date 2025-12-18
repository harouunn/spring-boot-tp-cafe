package tn.esprit.spring.tpcafe_harounbensalem.dto.Commande;

import lombok.*;
import tn.esprit.spring.tpcafe_harounbensalem.entities.StatusCommande;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeRequest {
    private LocalDate dateCommande;
    private float totalCommande;
    private StatusCommande statusCommande;

    private Long clientId;
    private List<Long> detailCommandeIds;
}
