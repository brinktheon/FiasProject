package com.data.transf.fias.worker.services.Impl;

import com.data.transf.fias.worker.repositories.ItemRepository;
import com.data.transf.fias.worker.model.Item;
import com.data.transf.fias.worker.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class ItemServiceImpl implements ItemService {
    private final ItemRepository repository;

    @Autowired
    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean saveItem(Item item) {

        if (item == null) {
            return false;
        }
        repository.save(item);
        return true;
    }

    @Override
    public boolean saveAllItems(List<Item> items) {
        if (items.isEmpty()){
            return false;
        }
        repository.saveAll(items);
        return true;
    }

    @Override
    public List<Item> getListItems(int page, int size) {
        return repository.findAll(PageRequest.of(page, size)).getContent();
    }
}
