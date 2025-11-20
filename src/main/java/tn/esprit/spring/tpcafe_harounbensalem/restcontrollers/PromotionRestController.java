package tn.esprit.spring.tpcafe_harounbensalem.restcontrollers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_harounbensalem.entities.Promotion;
import tn.esprit.spring.tpcafe_harounbensalem.services.IPromotionService;

import java.util.List;

@RestController
@RequestMapping("Promotion")
public class PromotionRestController {
    private IPromotionService PromotionService;

    @PostMapping
    public Promotion addPromotion(Promotion p) {
        return PromotionService.addPromotion(p);
    }

    @PostMapping
    public List<Promotion> savePromotion(List<Promotion> Promotions) {
        return PromotionService.savePromotion(Promotions);
    }

    @GetMapping
    public Promotion selectPromotionByIdWithGet(Long id) {
        return PromotionService.selectPromotionByIdWithGet(id);
    }

    @GetMapping
    public Promotion selectPromotionByIdWithOrElse(Long id) {
        return PromotionService.selectPromotionByIdWithOrElse(id);
    }

    @GetMapping
    public List<Promotion> selectAllPromotions() {
        return PromotionService.selectAllPromotions();
    }

    @DeleteMapping
    public void deletePromotion(Promotion p) {
        PromotionService.deletePromotion(p);
    }

    @DeleteMapping
    public void deleteAllPromotions() {
        PromotionService.deleteAllPromotions();
    }

    @DeleteMapping
    public void deletePromotionById(long id) {
        PromotionService.deletePromotionById(id);
    }

    @GetMapping
    public long countingPromotions() {
        return PromotionService.countingPromotions();
    }

    @GetMapping
    public boolean verifPromotionById(long id) {
        return PromotionService.verifPromotionById(id);
    }
}
