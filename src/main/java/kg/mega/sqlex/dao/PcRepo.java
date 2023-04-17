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

//    select model, speed, hd from pc
//    where (cd = '12x' or cd = '24x') and price < 600

    @Query("select Pc from Pc where Pc.cd IN :cdes and Pc.price < :price")
    List<Pc> findAllByCdInAndPriceLassThen(@Param("cdes")List<String> cdes,@Param("price") Double price);

}
