package kg.mega.sqlex.dao;

import kg.mega.sqlex.models.entity.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface LaptopRepo extends CrudRepository<Laptop, Integer> {

    List<Laptop> findByPriceGreaterThan(Double price);

//    select model, speed from laptop
//    join product product.model = laptop.model  where hd < 10

    List<Laptop> findAllByHdGreaterThanEqual(Double hd);

}
