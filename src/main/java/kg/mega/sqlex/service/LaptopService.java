package kg.mega.sqlex.service;

import kg.mega.sqlex.models.dto.MakerSpeedLaptop;
import kg.mega.sqlex.models.dto.ModelRamScreenLaptopDto;
import kg.mega.sqlex.models.entity.Laptop;

import java.util.List;

public interface LaptopService {
    List<ModelRamScreenLaptopDto> findModelRamScreenByPriceFromLaptop(Double price);
    List<MakerSpeedLaptop> findMakerSpeedByHd(Double hd);
}
