package tn.esprit.spring.tpcafe_harounbensalem.dto.Client;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientRequest {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    private Long carteId;
    private Long adresseId;
}
