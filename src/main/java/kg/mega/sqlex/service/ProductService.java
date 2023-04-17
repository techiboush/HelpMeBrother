package kg.mega.sqlex.service;

import kg.mega.sqlex.models.dto.PrinterMaker;

import java.util.List;

public interface ProductService {
    List<PrinterMaker> findDistinctPrinterMakerByType(String type);
}
