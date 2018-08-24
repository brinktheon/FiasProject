package com.data.transf.fias.worker.services;

import com.data.transf.fias.worker.model.Item;

import java.util.List;

public interface ItemService {
    boolean saveItem(Item item);

    boolean saveAllItems(List<Item> items);

    List<Item> getListItems(int page, int size);
}
