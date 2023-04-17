package kg.mega.sqlex.service;

import kg.mega.sqlex.dao.LaptopRepo;
import kg.mega.sqlex.models.dto.ModelRamScreenLaptopDto;
import kg.mega.sqlex.models.entity.Laptop;
import kg.mega.sqlex.models.mapper.LaptopMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaptopServiceImpl implements LaptopService {

    private final LaptopMapper laptopMapper = LaptopMapper.INSTANCE;

    private final LaptopRepo laptopRepo;

    public LaptopServiceImpl(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }

    @Override
    public List<ModelRamScreenLaptopDto> findModelRamScreenByPriceFromLaptop(double price) {
        List<Laptop> laptops = laptopRepo.findByPriceGreaterThan(price);

        List<ModelRamScreenLaptopDto> modelRamScreenLaptopDtos = laptops
                .stream()
                .map(x -> laptopMapper.mapperToModelRamScreenLaptopDto(x))
                .collect(Collectors.toList());

        return modelRamScreenLaptopDtos;
    }
}
