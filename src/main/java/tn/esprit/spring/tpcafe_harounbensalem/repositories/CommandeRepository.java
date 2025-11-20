package tn.esprit.spring.tpcafe_harounbensalem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
