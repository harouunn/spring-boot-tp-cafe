package tn.esprit.spring.tpcafe_harounbensalem.dto.CarteFidelite;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarteFideliteRequest {
     private int pointsAccumules;
     private LocalDate dateCreation;
}
