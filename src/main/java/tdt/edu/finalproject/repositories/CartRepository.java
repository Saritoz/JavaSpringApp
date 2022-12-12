package tdt.edu.finalproject.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tdt.edu.finalproject.models.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
    Iterable<Cart> findCartByUsername(String username);

    Iterable<Cart> findCartByStatus(String status);

    Iterable<Cart> findCartByIdFlower(int idFlower);

    @Query(value = "select * from Cart c where c.id = ?1", nativeQuery = true)
    Iterable<Cart> findCartById(@Param("id") int id);

    @Query(value = "select * from Cart c where c.username = ?1 and c.status = 'add_cart'", nativeQuery = true)
    Iterable<Cart> findCartByUsernameOrder(@Param("username") String username);

    @Query(value = "UPDATE Cart c SET c.status = 'waiting' WHERE c.id = ?1", nativeQuery = true)
    <S> void saveCart(@Param("id") int id);
}
