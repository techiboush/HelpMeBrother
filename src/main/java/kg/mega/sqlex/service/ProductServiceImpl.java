package kg.mega.sqlex.service;

import kg.mega.sqlex.dao.ProductRepo;
import kg.mega.sqlex.models.dto.PrinterMaker;
import kg.mega.sqlex.models.entity.Product;
import kg.mega.sqlex.models.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper = ProductMapper.INSTANCE;

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<PrinterMaker> findDistinctPrinterMakerByType(String type) {
        List<Product> products = productRepo.findDistinctMakerByType(type);

        List<PrinterMaker> printerMakers = products
                .stream()
                .map(x -> productMapper.mapperToPrinterMaker(x))
                .collect(Collectors.toList());

        return printerMakers.stream().distinct().collect(Collectors.toList());
    }

}
