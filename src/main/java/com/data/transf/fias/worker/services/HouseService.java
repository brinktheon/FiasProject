package com.data.transf.fias.worker.services;

import com.data.transf.fias.worker.model.House;

import java.util.List;

public interface HouseService {

    boolean saveAllHouses(List<House> houses);
}
