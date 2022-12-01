package tdt.edu.finalproject.repositories;

import org.springframework.data.repository.CrudRepository;

import tdt.edu.finalproject.models.Flower;

public interface FlowerRepository extends CrudRepository<Flower, Integer> {
    
}
