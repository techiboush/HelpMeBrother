package kg.mega.sqlex.service;

import kg.mega.sqlex.dao.PrinterRepo;
import kg.mega.sqlex.models.dto.PrinterDto;
import kg.mega.sqlex.models.entity.Printer;
import kg.mega.sqlex.models.mapper.PrinterMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrinterServiceImpl implements PrinterService {

    PrinterMapper printerMapper = PrinterMapper.INSTANCE;

    public PrinterServiceImpl(PrinterRepo printerRepo) {
        this.printerRepo = printerRepo;
    }

    private final PrinterRepo printerRepo;
    @Override
    public List<PrinterDto> findColorPrinters(Character color) {
        List<Printer> printers = printerRepo.findAllByColor(color);

        List<PrinterDto> printerDtos = printers
                .stream()
                .map(x -> printerMapper.mapperToPrinterDto(x))
                .collect(Collectors.toList());

        return printerDtos;
    }
}
