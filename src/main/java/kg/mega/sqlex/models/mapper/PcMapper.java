package kg.mega.sqlex.models.mapper;

import kg.mega.sqlex.models.dto.ModelSpeedHd;
import kg.mega.sqlex.models.entity.Pc;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PcMapper {
    PcMapper INSTANCE = Mappers.getMapper(PcMapper.class);

    @Mapping(target = "model", source = "product.model")
    ModelSpeedHd mapperToModelSpeedHd(Pc pc);
}
