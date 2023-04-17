package kg.mega.sqlex.dao;

import kg.mega.sqlex.models.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, String> {

    List<Product> findDistinctMakerByType(String type);

}
