package com.data.transf.fias.worker.repositories;

import com.data.transf.fias.worker.model.House;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public interface HouseRepository extends PagingAndSortingRepository<House, Long> {
}
