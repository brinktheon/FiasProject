package com.data.transf.fias.worker.repositories;

import com.data.transf.fias.worker.model.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {

}
