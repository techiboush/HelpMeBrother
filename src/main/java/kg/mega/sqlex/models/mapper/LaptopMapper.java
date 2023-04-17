package kg.mega.sqlex.models.mapper;

import kg.mega.sqlex.models.dto.ModelRamScreenLaptopDto;
import kg.mega.sqlex.models.entity.Laptop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LaptopMapper {
    LaptopMapper INSTANCE = Mappers.getMapper(LaptopMapper.class);

    @Mapping(target = "model", source = "product.model")
    ModelRamScreenLaptopDto mapperToModelRamScreenLaptopDto(Laptop laptop);
}
