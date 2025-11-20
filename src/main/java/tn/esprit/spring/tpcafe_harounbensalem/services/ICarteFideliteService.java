package tn.esprit.spring.tpcafe_harounbensalem.services;

import tn.esprit.spring.tpcafe_harounbensalem.entities.CarteFidelite;

import java.util.List;

public interface ICarteFideliteService {
    CarteFidelite addCarteFidelite(CarteFidelite cf);
    List<CarteFidelite> saveCarteFidelite(List<CarteFidelite> CarteFidelites);
    CarteFidelite selectCarteFideliteByIdWithGet(Long idCarteFidelite);
    CarteFidelite selectCarteFideliteByIdWithOrElse(Long idCarteFidelite);
    List<CarteFidelite> selectAllCarteFidelites();
    void deleteCarteFidelite(CarteFidelite cf);
    void deleteAllCarteFidelites();
    void deleteCarteFideliteById(long idCarteFidelite);
    long countingCarteFidelites();
    boolean verifCarteFideliteById(long idCarteFidelite);
}
