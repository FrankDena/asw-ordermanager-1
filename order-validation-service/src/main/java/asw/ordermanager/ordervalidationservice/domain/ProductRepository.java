package asw.ordermanager.ordervalidationservice.domain;

import asw.ordermanager.ordervalidationservice.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface ProductRepository extends CrudRepository<Product, String> {

    public Collection<Product> findAll();

    public Collection<Product> findByCategory(String category);

    public Collection<Product> findByNameIn(List<String> names);

}
