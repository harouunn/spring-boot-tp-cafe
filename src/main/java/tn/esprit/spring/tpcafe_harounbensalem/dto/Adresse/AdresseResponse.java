package tn.esprit.spring.tpcafe_harounbensalem.dto.Adresse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdresseResponse {
     private long idAdresse;
     private String rue;
     private String ville;
     private int codePostal;
}
