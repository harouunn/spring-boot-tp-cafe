package tn.esprit.spring.tpcafe_harounbensalem.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "adresse")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAdresse;

    @Column(name = "rue")
    String rue;

    @Column(name = "ville")
    String ville;

    @Column(name = "code_postal")
    String codePostal;
}

