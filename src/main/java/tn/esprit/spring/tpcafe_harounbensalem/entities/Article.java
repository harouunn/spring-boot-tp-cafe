package tn.esprit.spring.tpcafe_harounbensalem.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;
@Entity
@Table(name= "article")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idArticle;

    @Column(name= "Name")
    String nomArticle;

    float prixArticle;

    TypeArticle typeArticle;

    @ManyToMany
    List<Promotion> promotions;

    @OneToMany(mappedBy = "article")
    List<Detail_Commande> detailsCommande;



}

