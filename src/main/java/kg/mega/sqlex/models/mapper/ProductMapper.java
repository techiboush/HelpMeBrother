package kg.mega.sqlex.models.mapper;

import kg.mega.sqlex.models.dto.PrinterMaker;
import kg.mega.sqlex.models.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "maker", source = "product.maker")
    PrinterMaker mapperToPrinterMaker(Product product);

}
