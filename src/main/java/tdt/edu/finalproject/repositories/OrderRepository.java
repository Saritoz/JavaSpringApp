package tdt.edu.finalproject.repositories;

import org.springframework.data.repository.CrudRepository;

import tdt.edu.finalproject.models.OrderF;

public interface OrderRepository extends CrudRepository<OrderF, Integer>  {
    
}
