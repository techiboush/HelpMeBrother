package kg.mega.sqlex.service;

import com.sun.source.tree.LabeledStatementTree;
import kg.mega.sqlex.dao.LaptopRepo;
import kg.mega.sqlex.models.dto.MakerSpeedLaptop;
import kg.mega.sqlex.models.dto.ModelRamScreenLaptopDto;
import kg.mega.sqlex.models.entity.Laptop;
import kg.mega.sqlex.models.mapper.LaptopMapper;
import kg.mega.sqlex.models.mapper.LaptopMapperToMakerSpeedDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaptopServiceImpl implements LaptopService {

    private final LaptopMapper laptopMapper = LaptopMapper.INSTANCE;

    private final LaptopMapperToMakerSpeedDto laptopMapperToMakerSpeedDto = LaptopMapperToMakerSpeedDto.INSTANCE;

    private final LaptopRepo laptopRepo;

    public LaptopServiceImpl(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }

    @Override
    public List<ModelRamScreenLaptopDto> findModelRamScreenByPriceFromLaptop(Double price) {
        List<Laptop> laptops = laptopRepo.findByPriceGreaterThan(price);

        List<ModelRamScreenLaptopDto> modelRamScreenLaptopDtos = laptops
                .stream()
                .map(x -> laptopMapper.mapperToModelRamScreenLaptopDto(x))
                .collect(Collectors.toList());

        return modelRamScreenLaptopDtos;
    }

    @Override
    public List<MakerSpeedLaptop> findMakerSpeedByHd(Double hd) {
        List<Laptop> laptops = laptopRepo.findAllByHdGreaterThanEqual(hd);

        List<MakerSpeedLaptop> makerSpeedLaptops = laptops
                .stream()
                .map(x -> laptopMapperToMakerSpeedDto.mapperToMakerSpeedLaptopDto(x))
                .collect(Collectors.toList());

        return makerSpeedLaptops;
    }
}
