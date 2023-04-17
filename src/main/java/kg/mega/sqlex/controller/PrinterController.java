package kg.mega.sqlex.controller;

import kg.mega.sqlex.models.dto.PrinterDto;
import kg.mega.sqlex.models.entity.Printer;
import kg.mega.sqlex.service.PrinterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/printer")
public class PrinterController {
    private final PrinterService printerService;

    public PrinterController(PrinterService printerService) {
        this.printerService = printerService;
    }

    @GetMapping("/task4")
    public ResponseEntity<?> findColorPrinters(@RequestParam Character color) {
        List<PrinterDto> printerList = printerService.findColorPrinters(color);

        if(!printerList.isEmpty()) {
            return ResponseEntity.ok(printerList);
        }
        else {
            return ResponseEntity.noContent().build();
        }
    }
}
