package kg.mega.sqlex.dao;

import kg.mega.sqlex.models.entity.Printer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrinterRepo extends CrudRepository<Printer, Integer> {
    List<Printer> findAllByColor(Character color);
}

