package kg.mega.sqlex.models.mapper;

import kg.mega.sqlex.models.dto.PrinterDto;
import kg.mega.sqlex.models.entity.Printer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PrinterMapper {
    PrinterMapper INSTANCE = Mappers.getMapper(PrinterMapper.class);
    @Mapping(target = "model", source = "product.model")
    PrinterDto mapperToPrinterDto(Printer printer);
}
