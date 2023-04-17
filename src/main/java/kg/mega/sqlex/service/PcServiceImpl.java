package kg.mega.sqlex.service;

import kg.mega.sqlex.dao.PcRepo;
import kg.mega.sqlex.models.dto.ModelSpeedHd;
import kg.mega.sqlex.models.entity.Pc;
import kg.mega.sqlex.models.mapper.PcMapper;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PcServiceImpl implements PcService {
    private final PcMapper pcMapper = PcMapper.INSTANCE;

    private final PcRepo pcRepo;

    public PcServiceImpl(PcRepo pcRepo) {
        this.pcRepo = pcRepo;
    }

    @Override
    public List<ModelSpeedHd> findModelSpeedHdByPrice(double price) {
        List<Pc> pcs = pcRepo.findAllByPriceLessThan(price);

        List<ModelSpeedHd> modelSpeedHds = pcs
                .stream()
                .map(x-> pcMapper.mapperToModelSpeedHd(x))
                .collect(Collectors.toList());

        return modelSpeedHds;
    }

    @Override
    public List<ModelSpeedHd> findModelSpeedHdByCdAndPrice(List<String> cdes, Double price) {
        List<Pc> pcs = pcRepo.findAllByCdInAndPriceIsLessThan(cdes, price);

        List<ModelSpeedHd> modelSpeedHds = pcs
                .stream()
                .map(x -> pcMapper.mapperToModelSpeedHd(x))
                .collect(Collectors.toList());

        return modelSpeedHds;
    }
}
