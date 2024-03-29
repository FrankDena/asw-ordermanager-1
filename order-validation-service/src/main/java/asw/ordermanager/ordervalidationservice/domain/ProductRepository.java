package asw.ordermanager.ordervalidationservice.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface ProductRepository extends CrudRepository<Product, String> {

    public Collection<Product> findAll();

    public Collection<Product> findByNameIn(List<String> names);

}