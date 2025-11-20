package tn.esprit.spring.tpcafe_harounbensalem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Promotion;

public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
