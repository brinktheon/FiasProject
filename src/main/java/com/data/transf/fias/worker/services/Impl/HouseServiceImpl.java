package com.data.transf.fias.worker.services.Impl;

import com.data.transf.fias.worker.repositories.HouseRepository;
import com.data.transf.fias.worker.model.House;
import com.data.transf.fias.worker.services.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class HouseServiceImpl implements HouseService {

    private final HouseRepository repository;

    @Autowired
    public HouseServiceImpl(HouseRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean saveAllHouses(List<House> houses) {
        if (houses.isEmpty()){
            return false;
        }
        repository.saveAll(houses);
        return true;
    }
}
