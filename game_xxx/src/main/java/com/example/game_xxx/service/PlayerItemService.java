package com.example.game_xxx.service;

import com.example.game_xxx.entity.PlayerItem;
import com.example.game_xxx.repository.PlayerItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerItemService {
    @Autowired
    private PlayerItemRepository playerItemRepository;

    public boolean addPlayerItem(PlayerItem playerItem) {
        playerItemRepository.save(playerItem);
        return true;
    }
}
