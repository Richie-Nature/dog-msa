package com.msa.dogms.repository;

import com.msa.dogms.entity.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
}
