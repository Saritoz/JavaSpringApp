package tdt.edu.finalproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import tdt.edu.finalproject.models.OrderF;

public interface OrderRepository extends CrudRepository<OrderF, Integer> {
    @Query(value = "select * from Orderflower of GROUP BY of.idOrder", nativeQuery = true)
    Iterable<OrderF> findAllOrderGroupById();

    @Query(value = "select * from Orderflower of where of.idOrder = ?1", nativeQuery = true)
    List<OrderF> findOrderByIdOrder(@Param("idOrder") String idOrder);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Orderflower of SET of.status = 'Đang giao hàng' WHERE of.idOrder = ?1", nativeQuery = true)
    void updateDeliveryOrder(@Param("idOrder") String idOrder);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Orderflower of SET of.status = 'Thành công' WHERE of.idOrder = ?1", nativeQuery = true)
    void updateSuccessOrder(@Param("idOrder") String idOrder);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Orderflower of SET of.status = 'Từ chối' WHERE of.idOrder = ?1", nativeQuery = true)
    void updateDenyOrder(@Param("idOrder") String idOrder);

}
