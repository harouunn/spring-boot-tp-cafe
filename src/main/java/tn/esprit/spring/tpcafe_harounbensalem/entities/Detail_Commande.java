package tn.esprit.spring.tpcafe_harounbensalem.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CollectionId;

@Entity
@Table(name = "Detail_Commande")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode

public class Detail_Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idDetailCommande;

    @Column(name = "quantiteArticle")
    int quantiteArticle;

    @Column(name = "sousTotalDetailArticle")
    float sousTotalDetailArticle;

    @Column(name = "sousTotalDetailArticleApresPromo")
    float sousTotalDetailArticleApresPromo;

    @ManyToOne
    @JoinColumn(name = "commande_id", referencedColumnName = "idCommande")
    Commande commande;


    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "idArticle")
    Article article;
}

