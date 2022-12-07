package tdt.edu.finalproject.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tdt.edu.finalproject.models.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer>{
    Iterable<Cart> findCartByUsername(String username);
    Iterable<Cart> findCartByStatus(String status);
    @Query(value = "select * from Cart c where c.id = ?1", nativeQuery = true)
    Iterable<Cart> findCartById(@Param("id") int id);
}
