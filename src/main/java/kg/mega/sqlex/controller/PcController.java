package kg.mega.sqlex.controller;

import kg.mega.sqlex.models.dto.ModelSpeedHd;
import kg.mega.sqlex.service.PcService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pc")
public class PcController {

    private final PcService pcService;

    public PcController(PcService pcService) {
        this.pcService = pcService;
    }


    @GetMapping("/task1")
    public ResponseEntity<?> findModelSpeedHdByPrice(@RequestParam double price) {
        List<ModelSpeedHd> modelSpeedHds = pcService.findModelSpeedHdByPrice(price);

        if(!modelSpeedHds.isEmpty())
            return ResponseEntity.ok(modelSpeedHds);
        else
            return ResponseEntity.noContent().build();
    }

    @GetMapping("/task5")
    public ResponseEntity<?> findModelSpeedHdByCdAndPrice(@RequestParam List<String> cdes,@RequestParam Double price) {
        List<ModelSpeedHd> modelSpeedHds = pcService.findModelSpeedHdByCdAndPrice(cdes, price);

        if(!modelSpeedHds.isEmpty()) {
            return ResponseEntity.ok(modelSpeedHds);
        }
        else {
            return ResponseEntity.noContent().build();
        }
    }
}
