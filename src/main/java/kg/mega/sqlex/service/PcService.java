package kg.mega.sqlex.service;

import kg.mega.sqlex.models.dto.ModelSpeedHd;

import java.util.List;

public interface PcService {
    List<ModelSpeedHd> findModelSpeedHdByPrice(double price);
    List<ModelSpeedHd> findModelSpeedHdByCdAndPrice(List<String> cdes, Double price);
}
