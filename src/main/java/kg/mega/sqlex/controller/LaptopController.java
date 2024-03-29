package kg.mega.sqlex.controller;

import kg.mega.sqlex.models.dto.MakerSpeedLaptop;
import kg.mega.sqlex.models.dto.ModelRamScreenLaptopDto;
import kg.mega.sqlex.service.LaptopService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/task3")
    public ResponseEntity<?> findModelRamScreenByPriceFromLaptop(@RequestParam Double price) {
        List<ModelRamScreenLaptopDto> modelRamScreenLaptopDtos = laptopService.findModelRamScreenByPriceFromLaptop(price);

        if (!modelRamScreenLaptopDtos.isEmpty()) {
            return ResponseEntity.ok(modelRamScreenLaptopDtos);
        }
        else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/task6")
    public ResponseEntity<?> findMakerSpeedByHd(@RequestParam Double hd) {
        List<MakerSpeedLaptop> makerSpeedLaptops = laptopService.findMakerSpeedByHd(hd);
        if (!makerSpeedLaptops.isEmpty()) {
            return ResponseEntity.ok(makerSpeedLaptops);
        }
        else {
            return ResponseEntity.noContent().build();
        }
    }
}
