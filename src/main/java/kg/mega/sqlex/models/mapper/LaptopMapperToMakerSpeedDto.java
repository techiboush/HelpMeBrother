package kg.mega.sqlex.models.mapper;

import kg.mega.sqlex.models.dto.MakerSpeedLaptop;
import kg.mega.sqlex.models.dto.ModelRamScreenLaptopDto;
import kg.mega.sqlex.models.entity.Laptop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LaptopMapperToMakerSpeedDto {
    LaptopMapperToMakerSpeedDto INSTANCE = Mappers.getMapper(LaptopMapperToMakerSpeedDto.class);

    @Mapping(target = "maker", source = "product.maker")
    MakerSpeedLaptop mapperToMakerSpeedLaptopDto(Laptop laptop);
}
