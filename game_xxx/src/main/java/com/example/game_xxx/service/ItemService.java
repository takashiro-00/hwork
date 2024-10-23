package com.example.game_xxx.service;

import com.example.game_xxx.entity.Item;
import com.example.game_xxx.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public boolean addItem(Item item) {
        itemRepository.save(item);
        return true;
    }
}
