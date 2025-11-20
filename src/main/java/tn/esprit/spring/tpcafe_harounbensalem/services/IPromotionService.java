package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Promotion;

import java.util.List;

public interface IPromotionService {
    Promotion addPromotion(Promotion p);
    List<Promotion> savePromotion(List<Promotion> Promotions);
    Promotion selectPromotionByIdWithGet(Long idPromotion);
    Promotion selectPromotionByIdWithOrElse(Long idPromotion);
    List<Promotion> selectAllPromotions();
    void deletePromotion(Promotion p);
    void deleteAllPromotions();
    void deletePromotionById(long idPromotion);
    long countingPromotions();
    boolean verifPromotionById(long idPromotion);
}
