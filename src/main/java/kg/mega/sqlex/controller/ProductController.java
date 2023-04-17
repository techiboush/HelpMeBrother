package kg.mega.sqlex.controller;

import kg.mega.sqlex.models.dto.PrinterMaker;
import kg.mega.sqlex.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/task2")
    public ResponseEntity<?> findMakersWhereByType(@RequestParam String type) {
        List<PrinterMaker> printerMakers = productService.findDistinctPrinterMakerByType(type);

        if(!printerMakers.isEmpty()) {
            return ResponseEntity.ok(printerMakers);
        }
        else return ResponseEntity.noContent().build();
    }
}
