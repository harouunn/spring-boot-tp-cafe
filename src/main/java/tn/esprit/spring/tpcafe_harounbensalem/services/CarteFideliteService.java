package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.CarteFidelite;
import tn.esprit.spring.tpcafe_harounbensalem.repositories.CarteFideliteRepository;

import java.util.List;

public class CarteFideliteService implements ICarteFideliteService {

    private CarteFideliteRepository CarteFideliteRepository;
    @Override
    public CarteFidelite addCarteFidelite(CarteFidelite cf) {
        return CarteFideliteRepository.save(cf);
    }

    @Override
    public List<CarteFidelite> saveCarteFidelite(List<CarteFidelite> CarteFidelites) {
        return CarteFideliteRepository.saveAll(CarteFidelites);
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithGet(Long id) {
        return CarteFideliteRepository.findById(id).get();
    }
    @Override
    public CarteFidelite selectCarteFideliteByIdWithOrElse(Long id) {
        CarteFidelite a=CarteFidelite.builder().build();
        return CarteFideliteRepository.findById(id).orElse(a);
    }


    @Override
    public List<CarteFidelite> selectAllCarteFidelites() {
        return CarteFideliteRepository.findAll();
    }

    @Override
    public void deleteCarteFidelite(CarteFidelite cf) {
        CarteFideliteRepository.delete(cf);
    }

    @Override
    public void deleteAllCarteFidelites() {
        CarteFideliteRepository.deleteAll();

    }

    @Override
    public void deleteCarteFideliteById(long id) {
        CarteFideliteRepository.deleteById(id);
    }

    @Override
    public long countingCarteFidelites() {
        return CarteFideliteRepository.count();
    }

    @Override
    public boolean verifCarteFideliteById(long id) {
        return CarteFideliteRepository.existsById(id);
    }
}
