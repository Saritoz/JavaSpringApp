package tdt.edu.finalproject.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import tdt.edu.finalproject.models.Flower;

public interface FlowerRepository extends CrudRepository<Flower, Integer> {
    @Query(value = "select * from Flower f where f.id = ?1", nativeQuery = true)
    Iterable<Flower> findFlowerById(@Param("id") int id);

    @Query(value = "select * from Flower f where f.name LIKE %?1%", nativeQuery = true)
    Iterable<Flower> findAllFlowerByName(@Param("name") String name);

    // sort by price ASC
    @Query(value = "select * from Flower ORDER BY price ASC", nativeQuery = true)
    Iterable<Flower> FilterFlowerByPriceASC();

    // sort by price DESC
    @Query(value = "select * from Flower ORDER BY price DESC", nativeQuery = true)
    Iterable<Flower> FilterFlowerByPriceDESC();

    // sort by name ASC
    @Query(value = "select * from Flower ORDER BY name ASC", nativeQuery = true)
    Iterable<Flower> FilterFlowerByNameASC();

    // sort by name DESC
    @Query(value = "select * from Flower ORDER BY name DESC", nativeQuery = true)
    Iterable<Flower> FilterFlowerByNameDESC();

    @Query(value = "select * from Flower f where f.name LIKE %?1% ORDER BY name ASC", nativeQuery = true)
    Iterable<Flower> findByNameAndFilterFlowerByNameASC(@Param("name") String name);

    @Query(value = "select * from Flower f where f.name LIKE %?1% ORDER BY name DESC", nativeQuery = true)
    Iterable<Flower> findByNameAndFilterFlowerByNameDESC(@Param("name") String name);

    @Query(value = "select * from Flower f where f.name LIKE %?1% ORDER BY price ASC", nativeQuery = true)
    Iterable<Flower> findByNameAndFilterFlowerByPriceASC(@Param("name") String name);

    @Query(value = "select * from Flower f where f.name LIKE %?1% ORDER BY price DESC", nativeQuery = true)
    Iterable<Flower> findByNameAndFilterFlowerByPriceDESC(@Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Flower f SET f.name=?1, f.price=?2, f.description=?3, f.quantity=?4 where f.id = ?5", nativeQuery = true)
    void updateFlower(@Param("name") String name, @Param("price") int price, @Param("description") String description,
            @Param("quantity") int quantity, @Param("id") int id);
}
