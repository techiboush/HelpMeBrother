package kg.mega.sqlex.service;

import kg.mega.sqlex.models.dto.PrinterDto;
import kg.mega.sqlex.models.entity.Printer;

import java.util.List;

public interface PrinterService {
    List<PrinterDto> findColorPrinters(Character color);
}
