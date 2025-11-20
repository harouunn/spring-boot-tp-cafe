package tn.esprit.spring.tpcafe_harounbensalem.restcontrollers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_harounbensalem.entities.CarteFidelite;
import tn.esprit.spring.tpcafe_harounbensalem.services.ICarteFideliteService;

import java.util.List;

@RestController
@RequestMapping("CarteFidelite")
public class CarteFideliteRestController {
    private ICarteFideliteService CarteFideliteService;

    @PostMapping
    public CarteFidelite addCarteFidelite(CarteFidelite cf) {
        return CarteFideliteService.addCarteFidelite(cf);
    }

    @PostMapping
    public List<CarteFidelite> saveCarteFidelite(List<CarteFidelite> CarteFidelites) {
        return CarteFideliteService.saveCarteFidelite(CarteFidelites);
    }

    @GetMapping
    public CarteFidelite selectCarteFideliteByIdWithGet(Long id) {
        return CarteFideliteService.selectCarteFideliteByIdWithGet(id);
    }

    @GetMapping
    public CarteFidelite selectCarteFideliteByIdWithOrElse(Long id) {
        return CarteFideliteService.selectCarteFideliteByIdWithOrElse(id);
    }

    @GetMapping
    public List<CarteFidelite> selectAllCarteFidelites() {
        return CarteFideliteService.selectAllCarteFidelites();
    }

    @DeleteMapping
    public void deleteCarteFidelite(CarteFidelite cf) {
        CarteFideliteService.deleteCarteFidelite(cf);
    }

    @DeleteMapping
    public void deleteAllCarteFidelites() {
        CarteFideliteService.deleteAllCarteFidelites();
    }

    @DeleteMapping
    public void deleteCarteFideliteById(long id) {
        CarteFideliteService.deleteCarteFideliteById(id);
    }

    @GetMapping
    public long countingCarteFidelites() {
        return CarteFideliteService.countingCarteFidelites();
    }

    @GetMapping
    public boolean verifCarteFideliteById(long id) {
        return CarteFideliteService.verifCarteFideliteById(id);
    }
}