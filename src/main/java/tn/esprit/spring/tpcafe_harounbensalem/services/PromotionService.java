package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.Promotion;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Promotion;
import tn.esprit.spring.tpcafe_harounbensalem.repositories.PromotionRepository;

import java.util.List;

public class PromotionService implements IPromotionService {
    private PromotionRepository PromotionRepository;
    @Override
    public Promotion addPromotion(Promotion p) {
        return PromotionRepository.save(p);
    }

    @Override
    public List<Promotion> savePromotion(List<Promotion> Promotions) {
        return PromotionRepository.saveAll(Promotions);
    }

    @Override
    public Promotion selectPromotionByIdWithGet(Long id) {
        return PromotionRepository.findById(id).get();
    }
    @Override
    public Promotion selectPromotionByIdWithOrElse(Long id) {
        Promotion a=Promotion.builder().build();
        return PromotionRepository.findById(id).orElse(a);
    }


    @Override
    public List<Promotion> selectAllPromotions() {
        return PromotionRepository.findAll();
    }

    @Override
    public void deletePromotion(Promotion p) {
        PromotionRepository.delete(p);
    }

    @Override
    public void deleteAllPromotions() {
        PromotionRepository.deleteAll();

    }

    @Override
    public void deletePromotionById(long id) {
        PromotionRepository.deleteById(id);
    }

    @Override
    public long countingPromotions() {
        return PromotionRepository.count();
    }

    @Override
    public boolean verifPromotionById(long id) {
        return PromotionRepository.existsById(id);
    }
}
