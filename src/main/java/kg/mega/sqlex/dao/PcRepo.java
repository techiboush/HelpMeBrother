package kg.mega.sqlex.dao;

import kg.mega.sqlex.models.entity.Pc;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends CrudRepository<Pc, Integer> {

    List<Pc> findAllByPriceLessThan(double price);

    List<Pc> findAllByCdInAndPriceIsLessThan(List<String> cdes, Double price);

}
