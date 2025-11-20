package tn.esprit.spring.tpcafe_harounbensalem.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table( name = "Commande")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode

public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCommande;


    LocalDate dateCommande;

    @Column
    float totalCommande;

    @Enumerated(EnumType.STRING)
    StatusCommande statusCommande;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "idClient")
    Client client;


    @OneToMany(mappedBy = "commande")
    List<Detail_Commande> detailsCommande;
}

