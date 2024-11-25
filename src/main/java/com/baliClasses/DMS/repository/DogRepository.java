package com.baliClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import com.baliClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{

}
